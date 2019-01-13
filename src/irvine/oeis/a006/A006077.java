package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006077.
 * @author Sean A. Irvine
 */
public class A006077 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.THREE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return mA;
    } else if (mN > 1) {
      final Z t = mB.multiply(Z.valueOf(mN).multiply(9).subtract(9).multiply(mN).add(3))
        .subtract(mA.multiply(27).multiply(mN - 1).multiply(mN - 1))
        .divide(mN).divide(mN);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
