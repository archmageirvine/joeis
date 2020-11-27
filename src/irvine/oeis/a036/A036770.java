package irvine.oeis.a036;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036770 Number of labeled rooted trees with a degree constraint: (2*n)!/(2^n) * C(2*n+1, n).
 * @author Sean A. Irvine
 */
public class A036770 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(2 * mN).multiply(2 * mN - 1).divide2();
    }
    return mF.multiply(Binomial.binomial(2 * mN + 1, mN));
  }
}
