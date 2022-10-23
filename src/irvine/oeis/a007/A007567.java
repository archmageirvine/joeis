package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007567 Knopfmacher expansion of 1/2: a(n+1) = a(n-1)(a(n)+1)-1.
 * @author Sean A. Irvine
 */
public class A007567 extends Sequence0 {

  private boolean mFirst = true;
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.valueOf(-3);
    }
    if (mB == null) {
      if (mA == null) {
        mA = Z.TWO;
        return Z.valueOf(-2);
      }
      mB = Z.TWO;
    } else {
      final Z t = mA.multiply(mB.add(1)).subtract(1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
