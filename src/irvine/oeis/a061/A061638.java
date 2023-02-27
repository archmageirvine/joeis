package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a002.A002473;

/**
 * A061638 Primes p such that the greatest prime divisor of p-1 is 7.
 * @author Sean A. Irvine
 */
public class A061638 extends A002473 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(7) == 0) {
        final Z u = t.add(1);
        if (u.isProbablePrime()) {
          return u;
        }
      }
    }
  }
}

