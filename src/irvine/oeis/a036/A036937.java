package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a020.A020458;

/**
 * A036937 Smallest n-digit prime containing only digits 2 and 3.
 * @author Sean A. Irvine
 */
public class A036937 extends A020458 {

  private Z mA = super.next();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mA.toString().length() < mN) {
      mA = super.next();
    }
    return mA.toString().length() == mN ? mA : Z.ZERO;
  }
}
