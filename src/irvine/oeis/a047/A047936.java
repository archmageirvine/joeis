package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a001.A001918;

/**
 * A047936 Primes whose smallest positive primitive root (A001918) is not prime.
 * @author Sean A. Irvine
 */
public class A047936 extends A001918 {

  @Override
  public Z next() {
    while (true) {
      final Z r = super.next();
      if (!r.isProbablePrime()) {
        return getP();
      }
    }
  }
}
