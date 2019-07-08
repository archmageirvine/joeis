package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a020.A020882;

/**
 * A024409 Hypotenuses of more than one primitive Pythagorean triangle.
 * @author Sean A. Irvine
 */
public class A024409 extends A020882 {

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
