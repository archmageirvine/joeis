package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002054 Binomial coefficient C(2n+1, n-1).
 * @author Sean A. Irvine
 */
public class A002054 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(mN).multiply(2 * mN + 1).multiply2().divide(mN - 1).divide(mN + 2);
    }
    return mA;
  }
}
