package irvine.math.function;

import irvine.math.z.Z;

/**
 * Superfactorial function, product of factorials.
 * @author Sean A. Irvine
 */
class Superfactorial extends AbstractFunction1 {

  @Override
  public Z z(final long n) {
    Z prod = Z.ONE;
    for (long k = 2; k <= n; ++k) {
      prod = prod.multiply(Functions.FACTORIAL.z(k));
    }
    return prod;
  }
}
