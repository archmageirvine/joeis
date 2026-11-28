package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * A one argument predicate function.
 * @author Sean A. Irvine
 */
public interface Predicate {

  /**
   * Predicate.
   * @param n parameter
   * @return predicate value
   * @throws IllegalArgumentException if the parameter are not valid.
   */
  boolean is(final Z n);

  /**
   * Predicate.
   * @param n parameter
   * @return predicate value
   * @throws IllegalArgumentException if the parameter are not valid.
   */
  boolean is(final long n);

  /**
   * Predicate.
   * @param n parameter
   * @return predicate value
   * @throws IllegalArgumentException if the parameter are not valid.
   */
  boolean is(final int n);

  /**
   * Characteristic function.
   * @param n parameter
   * @return 1 if the predicate ist true, 0 otherwise
   * @throws IllegalArgumentException if the parameter is not valid.
   */
  default int iverson(final Z n) {
    return is(n) ? 1 : 0;
  }

  /**
   * Characteristic function.
   * @param n parameter
   * @return 1 if the predicate ist true, 0 otherwise
   * @throws IllegalArgumentException if the parameter is not valid.
   */
  default int iverson(final long n) {
    return is(n) ? 1 : 0;
  }

}

