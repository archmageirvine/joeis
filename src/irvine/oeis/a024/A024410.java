package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a020.A020883;

/**
 * A024410 Long leg of more than one primitive Pythagorean triangle.
 * @author Sean A. Irvine
 */
public class A024410 extends A020883 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (mA.equals(t)) {
        while (true) {
          final Z u = super.next();
          if (!u.equals(mA)) {
            mA = u;
            return t;
          }
        }
      }
      mA = t;
    }
  }
}
