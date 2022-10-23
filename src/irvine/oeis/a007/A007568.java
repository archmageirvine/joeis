package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007568 Knopfmacher expansion of 2/3: a(n+1) = a(n-1)(a(n)+1)-1.
 * @author Sean A. Irvine
 */
public class A007568 extends Sequence0 {

  private boolean mFirst = true;
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.FOUR;
    }
    if (mB == null) {
      if (mA == null) {
        mA = Z.THREE;
        return Z.THREE;
      }
      mB = Z.THREE;
    } else {
      final Z t = mA.multiply(mB.add(1)).subtract(1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
