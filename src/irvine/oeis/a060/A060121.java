package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a045.A045309;

/**
 * A060121 First solution mod p of x^3 = 2 for primes p such that only one solution exists.
 * @author Sean A. Irvine
 */
public class A060121 extends A045309 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z t = Z.TWO.mod(p);
    Z u = Z.NEG_ONE;
    while (true) {
      u = u.add(1);
      if (u.modPow(Z.THREE, p).equals(t)) {
        return u;
      }
    }
  }
}
