package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A025015 Central decanomial coefficients: largest coefficient of (1 + x + ... + x^9)^n.
 * @author Sean A. Irvine
 */
public class A025015 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final long m = 9 * ++mN / 2 + mN - 1;
    for (long k = 0; k <= 9 * mN / 20; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(mN, k).multiply(Binomial.binomial(m - 10 * k, mN - 1)));
    }
    return sum;
  }
}

