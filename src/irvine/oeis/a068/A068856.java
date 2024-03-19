package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a002.A002858;

/**
 * A068853.
 * @author Sean A. Irvine
 */
public class A068856 extends A002858 {

  private static final Z Z22 = Z.valueOf(22);
  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if (mA.subtract(t).equals(Z22) && mB.subtract(mA).equals(Z22)) {
        return t;
      }
    }
  }
}
