package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A010073 a(n) = sum of base-6 digits of a(n-1) + sum of base-6 digits of a(n-2); a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A010073 extends Sequence0 {

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
      final Z t = Z.valueOf(ZUtils.digitSum(mA, 6) + ZUtils.digitSum(mB, 6));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

