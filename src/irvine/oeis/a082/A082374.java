package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A082374 Set of n such that the prime quadruple prime(n), prime(n+1), prime(n+2), prime(n+3) does not have a solution for the congruence prime(n+1)^x - prime(n)^x == prime(n+2) mod prime(n+3).
 * @author Sean A. Irvine
 */
public class A082374 extends A000040 {

  private long mN = 0;

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
      ++mN;
      final Z p = super.next();
      if (is(p)) {
        return Z.valueOf(mN);
      }
    }
  }
}
