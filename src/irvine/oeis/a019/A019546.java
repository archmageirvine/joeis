package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A019546 Primes whose digits are primes.
 * @author Sean A. Irvine
 */
public class A019546 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z prime = super.next();
      Z t = prime;
      boolean ok = true;
      while (!Z.ZERO.equals(t)) {
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
