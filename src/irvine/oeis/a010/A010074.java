package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A010074 a(n) = sum of base-7 digits of a(n-1) + sum of base-7 digits of a(n-2).
 * @author Sean A. Irvine
 */
public class A010074 extends Sequence0 {

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
      final Z t = Z.valueOf(ZUtils.digitSum(mA, 7) + ZUtils.digitSum(mB, 7));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

