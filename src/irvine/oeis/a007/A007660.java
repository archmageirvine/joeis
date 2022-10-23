package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007660 a(n) = a(n-1)*a(n-2) + 1 with a(0) = a(1) = 0.
 * @author Sean A. Irvine
 */
public class A007660 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.ZERO;
    } else {
      final Z t = mA.multiply(mB).add(1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
