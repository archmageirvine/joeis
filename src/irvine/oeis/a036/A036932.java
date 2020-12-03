package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a020.A020453;

/**
 * A036932 Smallest n-digit prime containing only digits 1 and 5, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A036932 extends A020453 {

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
