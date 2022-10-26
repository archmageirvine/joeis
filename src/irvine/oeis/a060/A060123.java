package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a014.A014752;

/**
 * A060123 Second solution mod p of x^3 = 2 for primes p such that more than one solution exists.
 * @author Sean A. Irvine
 */
public class A060123 extends A014752 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z u = Z.NEG_ONE;
    boolean seen = false;
    while (true) {
      u = u.add(1);
      if (u.modPow(Z.THREE, p).equals(Z.TWO)) {
        if (seen) {
          return u;
        }
        seen = true;
      }
    }
  }
}
