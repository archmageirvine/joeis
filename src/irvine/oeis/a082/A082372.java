package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A082372 Primes prime(n) such that there are no solutions to the equation prime(n)^x + prime(n+1)^x = prime(n+2) (mod prime(n+3)) with x an integer.
 * @author Sean A. Irvine
 */
public class A082372 extends A000040 {

  private boolean is(final Z p) {
    final Z q = mPrime.nextPrime(p);
    final Z r = mPrime.nextPrime(q);
    final Z s = mPrime.nextPrime(r);
    final long sl = s.longValueExact();
    for (long k = 0; k < sl; ++k) {
      if (p.modPow(k, s).add(q.modPow(k, s)).subtract(r).mod(s).isZero()) {
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
