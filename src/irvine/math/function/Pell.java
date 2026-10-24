package irvine.math.function;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * Compute Pell numbers (A000129). 
 * a(n) = Sum_{k=1,3,5,...&lt;=n} C(n,k)*2^((k-1)/2)
 * @author Georg Fischer
 */
class Pell extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    return z(n.longValueExact());
  }

  @Override
  public Z z(final long n) {
    if (n < 0) {
      throw new UnsupportedOperationException();
    }
    Z sum = Z.ZERO;
    for (long k = 1; k <= n; k += 2) {
      sum = sum.add(Binomial.binomial(n, k).multiply(Z.ONE.shiftLeft((k - 1) / 2)));
    }
    return sum;
  }

}
