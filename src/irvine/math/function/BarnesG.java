package irvine.math.function;

import irvine.math.z.Z;

/**
 * Barnes G function: 0, 1 and product of factorials (n - 2).
 * @author Georg Fischer
 */
class BarnesG extends AbstractFunction1 {

  @Override
  public Z z(final long n) {
    if (n <= 0) {
      return Z.ZERO;
    }
    if (n == 1) {
      return Z.ONE;
    }
    Z prod = Z.ONE;
    for (long k = 2; k <= n - 2; ++k) {
      prod = prod.multiply(Functions.FACTORIAL.z(k));
    }
    return prod;
  }
}
