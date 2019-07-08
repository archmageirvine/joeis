package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a020.A020884;

/**
 * A024411.
 * @author Sean A. Irvine
 */
public class A024411 extends A020884 {

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
