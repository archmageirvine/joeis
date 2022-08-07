package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a057.A057023;

/**
 * A058501 Primes p such that largest odd factor of p-1 is not a prime (i.e., is composite or 1).
 * @author Sean A. Irvine
 */
public class A058501 extends A057023 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.isProbablePrime()) {
        return mP;
      }
    }
  }
}
