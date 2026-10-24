package irvine.math.function;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * Binomial coefficients n over k.
 * @author Georg Fischer
 */
class Binomial2 extends AbstractFunction2 {

  @Override
  public Z z(final long n, final long k) {
    if (0 <= k && k <= n) {
      return Binomial.binomial(n, k);
    }
    if (k <= n && n < 0) {
      return Binomial.binomial(-k - 1, n - k).multiply(((n - k) & 1) == 0 ? 1 : -1);
    }
    if (n < 0 && 0 <= k) {
      return Binomial.binomial(-n + k - 1, k).multiply((k & 1) == 0 ? 1 : -1);
    }
    return Z.ZERO;
  }
}
