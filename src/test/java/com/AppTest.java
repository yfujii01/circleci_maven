package com;

import org.junit.Test;
import static org.junit.Assert.*;

import org.hamcrest.core.Is;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
        assertThat("messageCheck", classUnderTest.getGreeting(), Is.is("Hello world."));
    }
    @Test public void test02() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
        assertThat("messageCheck", classUnderTest.getGreeting(), Is.is("Hello world.a"));
    }
}
