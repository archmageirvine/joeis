package irvine.oeis.a052;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052187 Smallest prime p such that p, p+d, and p+2d are consecutive primes for each possible d either 2 or divisible by 6.
 * @author Sean A. Irvine
 */
public class A052187 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mD = -1;

  @Override
  public Z next() {
    if (mD < 0) {
      mD = 0;
      return Z.THREE; // actually d = 2 case
    }
    mD += 6;
    long p = 2;
    while (true) {
      p = mPrime.nextPrime(p);
      final long q = mPrime.nextPrime(p);
      if (q - p == mD) {
        final long r = mPrime.nextPrime(q);
        if (r - q == mD) {
          return Z.valueOf(p);
        }
      }
    }
  }
}

