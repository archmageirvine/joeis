package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074979 Primes for which the two closest primes are smaller.
 * @author Sean A. Irvine
 */
public class A074979 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long d = mPrime.nextPrime(p).subtract(p).longValueExact();
      if (p.subtract(mPrime.prevPrime(mPrime.prevPrime(p))).longValue() < d) {
        return p;
      }
    }
  }
}
