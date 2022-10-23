package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005831 a(n+1) = a(n) * (a(n-1) + 1).
 * @author Sean A. Irvine
 */
public class A005831 extends Sequence0 {

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
      final Z t = mB.multiply(mA.add(1));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
