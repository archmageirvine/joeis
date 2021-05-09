package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A045336 Palindromic terms from A019546.
 * @author Sean A. Irvine
 */
public class A045336 extends A002385 {

  @Override
  public Z next() {
    while (true) {
      final Z prime = super.next();
      Z t = prime;
      boolean ok = true;
      while (!t.isZero()) {
        final long r = t.mod(10);
        if (r != 2 && r != 3 && r != 5 && r != 7) {
          ok = false;
          break;
        }
        t = t.divide(10);
      }
      if (ok) {
        return prime;
      }
    }
  }
}
