package irvine.oeis.a018;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018901 Central hexanomial coefficients: largest coefficient of <code>(1 + x +</code> ... <code>+ x^5)^n</code>.
 * @author Sean A. Irvine
 */
public class A018901 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    final long m = 5 * ++mN / 2 + mN - 1;
    for (long k = 0; k <= 5 * mN / 12; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(mN, k).multiply(Binomial.binomial(m - 6 * k, mN - 1)));
    }
    return sum;
  }
}
