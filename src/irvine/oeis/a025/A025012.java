package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A025012 Central heptanomial coefficients: largest coefficient of (1+x+...+x^6)^n.
 * @author Sean A. Irvine
 */
public class A025012 extends Sequence0 implements DirectSequence {

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
    final long m = 6 * n / 2 + n - 1;
    for (long k = 0; k <= 6 * n / 14; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(n, k).multiply(Binomial.binomial(m - 7 * k, n - 1)));
    }
    return sum;
  }
}

