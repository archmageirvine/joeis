package irvine.oeis.a018;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A018901 Central hexanomial coefficients: largest coefficient of (1 + x + ... + x^5)^n.
 * @author Sean A. Irvine
 */
public class A018901 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    Z sum = Z.ZERO;
    final long m = 5 * n / 2 + n - 1;
    for (long k = 0; k <= 5 * n / 12; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(n, k).multiply(Binomial.binomial(m - 6 * k, n - 1)));
    }
    return sum;
  }
}
