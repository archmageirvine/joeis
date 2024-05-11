package irvine.math.predicate;

import irvine.math.z.Z;

/**
 * A two argument predicate function.
 * @author Sean A. Irvine
 */
public interface Predicate2 extends Predicate {

  /**
   * Two argument predicate.
   * @param t parameter
   * @param n parameter
   * @return predicate value
   * @throws IllegalArgumentException if the parameters are not valid.
   */
  boolean is(final long t, final Z n);

  /**
   * Two argument predicate.
   * @param t parameter
   * @param n parameter
   * @return predicate value
   * @throws IllegalArgumentException if the parameters are not valid.
   */
  boolean is(final long t, final long n);

  /**
   * Return a default for the first parameter.
   * @return default first parameter
   */
  long getDefault();
}

