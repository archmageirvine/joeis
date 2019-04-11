package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007567 Knopfmacher expansion of <code>1/2</code>: <code>a(n+1) = a(n-1)(a(n)+1)-1</code>.
 * @author Sean A. Irvine
 */
public class A007567 implements Sequence {

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
