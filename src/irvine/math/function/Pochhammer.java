package irvine.math.function;

import irvine.math.z.Z;

/**
 * Pochhamer symbol (rising factorials).
 * @author Sean A. Irvine
 */
class Pochhammer extends AbstractFunction2 {

  // These constants control the approach used to compute
  private static final long USE_FACTORIAL_N = 1000;
  private static final long USE_FACTORIAL_M = 5;

  @Override
  public Z z(final long n, final long m) {
    if (n == 0) {
      return Z.ZERO;
    }
    if (m == 0) {
      return Z.ONE;
    }
    if (n == 1) {
      return Functions.FACTORIAL.z(m);
    }
    if (m > USE_FACTORIAL_M && n <= USE_FACTORIAL_N) {
      return Functions.FACTORIAL.z(n + m - 1).divide(Functions.FACTORIAL.z(n - 1));
    }
    Z prod = Z.ONE;
    for (long k = 0; k < m && !prod.isZero(); ++k) {
      prod = prod.multiply(n + k);
    }
    return prod;
  }
}
