package irvine.math.api;

/**
 * Definition of a method to test if a value is an integer.
 * @author Sean A. Irvine
 * @param <E> element type
 */
public interface IsInteger {

  /**
   * Test if the given value is an integer.
   * @param n value to test
   * @return true iff the value is an integer
   */
  boolean isInteger();
}
