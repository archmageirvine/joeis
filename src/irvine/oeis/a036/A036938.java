package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a020.A020459;

/**
 * A036938 Smallest n-digit prime containing only digits 2 and 7, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A036938 extends A020459 {

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
