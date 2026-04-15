package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A394014 allocated for Vincenzo Librandi.
 * @author Sean A. Irvine
 */
public class A394014 extends A000040 {

  private Z mA = null;
  private long mN = 0;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      while (true) {
        ++mN;
        final Z p = super.next();
        if (mA.compareTo(mN) < 0 && p.subtract(mN).isProbablePrime()) {
          mA = p;
          break;
        }
      }
    }
    return mA;
  }
}
