package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084435 a(1) = 2, then smallest prime of the form 2^k*a(n-1) + 1.
 * @author Sean A. Irvine
 */
public class A084435 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      while (true) {
        if (mA.add(1).isProbablePrime()) {
          mA = mA.add(1);
          break;
        }
        mA = mA.multiply2();
      }
    }
    return mA;
  }
}
