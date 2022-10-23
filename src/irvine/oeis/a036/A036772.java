package irvine.oeis.a036;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036772 Number of labeled rooted trees with a degree constraint: ((4*n)!/(24^n)) * binomial(4*n+1, n).
 * @author Sean A. Irvine
 */
public class A036772 extends Sequence0 {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(4 * mN).multiply(4 * mN - 1).multiply(4 * mN - 2).multiply(4 * mN - 3).divide(24);
    }
    return mF.multiply(Binomial.binomial(4 * mN + 1, mN));
  }
}
