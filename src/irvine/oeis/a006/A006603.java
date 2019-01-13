package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006603.
 * @author Sean A. Irvine
 */
public class A006603 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN / 2 + 1; ++k) {
      Z t = Z.ZERO;
      for (long j = 0; j <= mN - 2 * k + 2; ++j) {
        t = t.add(Binomial.binomial(mN - k + 2, j).multiply(Binomial.binomial(2 * mN - 3 * k - j + 3, mN - k + 1)));
      }
      sum = sum.add(t.multiply(k).divide(mN - k + 2));
    }
    return sum;
  }
}
