package irvine.math.function;

import irvine.math.z.Z;

/**
 * Kaprekar map.
 * @author Sean A. Irvine
 */
class Kaprekar extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    return Functions.DIGIT_SORT_DESCENDING.z(n).subtract(Functions.DIGIT_SORT_ASCENDING.z(n));
  }

  @Override
  public long l(final long n) {
    return Functions.DIGIT_SORT_DESCENDING.l(n) - Functions.DIGIT_SORT_ASCENDING.l(n);
  }
}
