package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A071704 Number of ways to represent the n-th prime as arithmetic mean of three other odd primes.
 * @author Sean A. Irvine
 */
public class A071704 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z s = p.multiply(3);
    long cnt = 0;
    for (Z q = Z.THREE; q.compareTo(s) <= 0; q = mPrime.nextPrime(q)) {
      if (!q.equals(p)) {
        final Z u = s.subtract(q);
        for (Z r = Z.THREE; r.compareTo(q) <= 0; r = mPrime.nextPrime(r)) {
          if (!r.equals(p)) {
            final Z t = u.subtract(r);
            if (t.compareTo(r) <= 0 && !t.equals(p) && mPrime.isPrime(t)) {
              ++cnt;
            }
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
