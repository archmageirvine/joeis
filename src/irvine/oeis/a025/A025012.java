package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025012 Central heptanomial coefficients: largest coefficient of <code>(1+x+...+x^6)^n</code>.
 * @author Sean A. Irvine
 */
public class A025012 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final long m = 6 * ++mN / 2 + mN - 1;
    for (long k = 0; k <= 6 * mN / 14; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(mN, k).multiply(Binomial.binomial(m - 7 * k, mN - 1)));
    }
    return sum;
  }
}

