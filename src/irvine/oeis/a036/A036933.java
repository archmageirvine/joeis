package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a020.A020454;

/**
 * A036933 Smallest n-digit prime containing only digits 1 and 6, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A036933 extends A020454 {

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
