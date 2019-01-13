package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A010073.
 * @author Sean A. Irvine
 */
public class A010073 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.ONE;
    } else {
      final Z t = Z.valueOf(ZUtils.digitSum(mA, Z.SIX) + ZUtils.digitSum(mB, Z.SIX));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

