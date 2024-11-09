package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072999 a(n+1) is the smallest prime &gt; a(n) such that a(n+1) == a(n-1) (mod a(n)).
 * @author Sean A. Irvine
 */
public class A072999 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.TWO;
        return Z.TWO;
      }
      mB = Z.THREE;
      return Z.THREE;
    }
    Z t = mA;
    do {
      t = t.add(mB);
    } while (!t.isProbablePrime());
    mA = mB;
    mB = t;
    return t;
  }
}
