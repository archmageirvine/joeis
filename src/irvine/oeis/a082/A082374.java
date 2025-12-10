package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A082374 Numbers k such that the congruence prime(k+1)^x - prime(k)^x == prime(k+2) mod prime(k+3) does not have a solution.
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
