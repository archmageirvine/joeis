package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006277 a(n) = (a(n-1) + 1)*a(n-2).
 * @author Sean A. Irvine
 */
public class A006277 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.ONE;
    } else {
      final Z t = mB.add(1).multiply(mA);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
