package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055937 a(n) = a(n-1) * a(n-2) - 1.
 * @author Sean A. Irvine
 */
public class A055937 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.TWO;
        return mA;
      }
      mB = Z.TWO;
    } else {
      final Z t = mA.multiply(mB).subtract(1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
