package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A082376 First of quadruple of consecutive primes p1,p2,p3,p4 such that the congruence p2^x - p1^x == p3 (mod p4) has no solution.
 * @author Sean A. Irvine
 */
public class A082376 extends A000040 {

  private boolean is(final Z p) {
    final Z q = mPrime.nextPrime(p);
    final Z r = mPrime.nextPrime(q);
    final Z s = mPrime.nextPrime(r);
    final long sl = s.longValueExact();
    for (long k = 0; k < sl; ++k) {
      if (q.modPow(k, s).subtract(p.modPow(k, s)).subtract(r).mod(s).isZero()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
