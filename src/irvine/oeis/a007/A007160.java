package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007160 Number of diagonal dissections of a convex (n+6)-gon into n regions.
 * @author Sean A. Irvine
 */
public class A007160 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(2 * mN + 3).multiply(mN + 3).multiply(mN + 2).multiply2().divide(mN + 5).divide(mN - 1).divide(mN);
    }
    return mA;
  }
}
