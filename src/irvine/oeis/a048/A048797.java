package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A048797 Primes p such that pp'-2 is prime, where p' denotes the next prime after p.
 * @author Sean A. Irvine
 */
public class A048797 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z p = mP;
      mP = super.next();
      if (p.multiply(mP).subtract(2).isProbablePrime()) {
        return p;
      }
    }
  }
}
