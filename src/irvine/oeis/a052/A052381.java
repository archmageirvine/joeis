package irvine.oeis.a052;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;

/**
 * A052381 The smallest initial prime of 2 non-overlapping d-twin primes if the distance between pairs (D) is minimal (see A052380).
 * @author Sean A. Irvine
 */
public class A052381 extends A052380 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    final Z d = Z.valueOf(2L * ++mN);
    final Z bigD = super.next();
    Z p = Z.TWO;
    while (true) {
      p = mPrime.nextPrime(p);
      final Z q = mPrime.nextPrime(p);
      if (q.subtract(p).equals(d)) {
        final Z r = mPrime.nextPrime(q);
        if (r.subtract(q).equals(d)) {
          return p;
        }
        final int c = r.subtract(p).compareTo(bigD);
        if (c == 0) {
          final Z s = mPrime.nextPrime(r);
          if (s.subtract(r).equals(d)) {
            return p;
          }
        }
      }
    }
  }
}
