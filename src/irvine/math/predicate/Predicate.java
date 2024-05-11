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

}

