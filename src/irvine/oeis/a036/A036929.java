package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a020.A020449;

/**
 * A036929 Smallest n-digit prime containing only digits 0 and 1, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A036929 extends A020449 {

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
