package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073680 a(1) =2, a(2) = 3, a(n+2) = smallest prime such that a(n+2) - a(n+1) is a multiple of a(n).
 * @author Sean A. Irvine
 */
public class A073680 extends Sequence1 {

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
      return mB;
    }
    Z r = mB;
    while (true) {
      r = r.add(mA);
      if (r.isProbablePrime()) {
        mA = mB;
        mB = r;
        return r;
      }
    }
  }
}
