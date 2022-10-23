package irvine.oeis.a036;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036771 Number of labeled rooted trees with a degree constraint: ((3*n)!/(6^n)) * binomial(3*n + 1, n).
 * @author Sean A. Irvine
 */
public class A036771 extends Sequence0 {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(3 * mN).multiply(3 * mN - 1).multiply(3 * mN - 2).divide(6);
    }
    return mF.multiply(Binomial.binomial(3 * mN + 1, mN));
  }
}
