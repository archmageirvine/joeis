package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A082484 First of four consecutive primes p, q, r, s such that neither of the congruences p^x+q^x = r (mod s) and q^x-p^x = r (mod s) has a solution.
 * @author Sean A. Irvine
 */
public class A082484 extends A000040 {

  private boolean is(final Z p) {
    final Z q = mPrime.nextPrime(p);
    final Z r = mPrime.nextPrime(q);
    final Z s = mPrime.nextPrime(r);
    final long sl = s.longValueExact();
    for (long k = 0; k < sl; ++k) {
      final Z pk = p.modPow(k, s);
      final Z qk = q.modPow(k, s);
      if (qk.add(pk).subtract(r).mod(s).isZero() || qk.subtract(pk).subtract(r).mod(s).isZero()) {
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
