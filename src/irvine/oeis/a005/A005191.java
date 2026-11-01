package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A005191 Central pentanomial coefficients: largest coefficient of (1 + x + ... + x^4)^n.
 * @author Sean A. Irvine
 */
public class A005191 extends Sequence0 implements DirectSequence {

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
    for (long k = 0; k <= 2 * n / 5; ++k) {
      sum = sum.add(Binomial.binomial(n, k).multiply(Binomial.binomial(-n, 2 * n - 5 * k)));
    }
    return sum;
  }
}

