package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A010076 <code>a(n) =</code> sum of base-9 digits of <code>a(n-1) +</code> sum of base-9 digits of <code>a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A010076 implements Sequence {

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
      final Z t = Z.valueOf(ZUtils.digitSum(mA, Z.NINE) + ZUtils.digitSum(mB, Z.NINE));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

