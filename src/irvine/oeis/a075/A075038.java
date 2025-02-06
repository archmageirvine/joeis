package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A075038 Primes for which the six closest primes are smaller.
 * @author Sean A. Irvine
 */
public class A075038 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long d = mPrime.nextPrime(p).subtract(p).longValueExact();
      if (p.subtract(mPrime.prevPrime(mPrime.prevPrime(mPrime.prevPrime(mPrime.prevPrime(mPrime.prevPrime(mPrime.prevPrime(p))))))).longValue() < d) {
        return p;
      }
    }
  }
}
