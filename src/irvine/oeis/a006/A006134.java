package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006134.
 * @author Sean A. Irvine
 */
public class A006134 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.THREE;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mB.multiply(5 * mN - 2).subtract(mA.multiply(4 * mN - 2)).divide(mN);
      mA = mB;
      mB = t;
    } else if (mN == 0) {
      return mA;
    }
    return mB;
  }
}
