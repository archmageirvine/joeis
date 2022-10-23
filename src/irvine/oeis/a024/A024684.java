package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024684 Number of ways prime(n) is a sum of three distinct primes.
 * @author Sean A. Irvine
 */
public class A024684 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long c = 0;
    for (long r = 2; 3 * r < mP; r = mPrime.nextPrime(r)) {
      final long u = mP - r;
      for (long s = mPrime.nextPrime(r); 2 * s < u; s = mPrime.nextPrime(s)) {
        final long t = u - s;
        if (mPrime.isPrime(t)) {
          ++c;
        }
      }
    }
    return Z.valueOf(c);
  }
}
