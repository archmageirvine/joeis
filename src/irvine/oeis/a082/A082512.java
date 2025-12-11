package irvine.oeis.a082;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082512 a(n) = p is the smallest prime introducing a consecutive prime-difference pattern as follows: [2,2n,2], i.e., [p, p+2, p+2+2n, p+2+2n+2] are consecutive primes. Increasing middle prime gap in the immediate neighborhood of two small gaps(=2); a(n) = 0 if no such pattern exists.
 * @author Sean A. Irvine
 */
public class A082512 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 3 != 2) {
      return Z.ZERO;
    }
    long p = 2;
    while (true) {
      p = mPrime.nextPrime(p);
      final long q = mPrime.nextPrime(p);
      if (q - p == 2) {
        final long r = mPrime.nextPrime(q);
        if (r - q == 2 * mN && mPrime.isPrime(r + 2)) {
          return Z.valueOf(p);
        }
      }
    }
  }
}
