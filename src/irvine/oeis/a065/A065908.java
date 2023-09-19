package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a007.A007522;

/**
 * A065907 First solution mod p of x^4 = 2 for primes p such that only two solutions exist.
 * @author Sean A. Irvine
 */
public class A065908 extends A007522 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z m = Z.ZERO;
    boolean seen = false;
    while (true) {
      m = m.add(1);
      if (m.modPow(Z.FOUR, p).equals(Z.TWO)) {
        if (seen) {
          return m;
        }
        seen = true;
      }
    }
  }
}
