package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007568 Knopfmacher expansion of <code>2/3</code>: <code>a(n+1) = a(n-1)(a(n)+1)-1</code>.
 * @author Sean A. Irvine
 */
public class A007568 implements Sequence {

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
