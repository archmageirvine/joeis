package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006438 Expansion of e.g.f. <code>1/sqrt(1-8x+x^2)</code>.
 * @author Sean A. Irvine
 */
public class A006438 implements Sequence {

  private long mN = -1;
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    ++mN;
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return mA;
      }
      mB = Z.FOUR;
    } else {
      final Z t = mB.multiply(2 * mN - 1).multiply(4).subtract(mA.multiply(mN - 1).multiply(mN - 1));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
