package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a051.A051037;

/**
 * A061599 Primes p such that the greatest prime divisor of p-1 is 5.
 * @author Sean A. Irvine
 */
public class A061599 extends A051037 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.mod(5) == 0) {
        final Z u = t.add(1);
        if (u.isProbablePrime()) {
          return u;
        }
      }
    }
  }
}

