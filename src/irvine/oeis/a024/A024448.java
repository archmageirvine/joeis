package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024448 a(n) = 3rd elementary symmetric function of the first n+2 primes.
 * @author Sean A. Irvine
 */
public class A024448 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mSum = Z.ZERO;
  private long mR = 3;

  @Override
  public Z next() {
    mR = mPrime.nextPrime(mR);
    final Z r = Z.valueOf(mR);
    for (long p = 2; p < mR; p = mPrime.nextPrime(p)) {
      final Z pr = r.multiply(p);
      for (long q = mPrime.nextPrime(p); q < mR; q = mPrime.nextPrime(q)) {
        mSum = mSum.add(pr.multiply(q));
      }
    }
    return mSum;
  }
}
