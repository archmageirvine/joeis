package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A082475 Prime index i for consecutive primes p(i),p(i+1),p(i+2),p(i+3) that do not have a solution for the congruences p(i)^x+p(i+1)^x = p(i+2) mod p(i+3) and p(i+1)^x-p(i)^x = p(i+2) mod p(i+3).
 * @author Sean A. Irvine
 */
public class A082475 extends A000040 {

  private long mN = 0;

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
      ++mN;
      final Z p = super.next();
      if (is(p)) {
        return Z.valueOf(mN);
      }
    }
  }
}
