package irvine.oeis.a070;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070281 Smallest prime which is the sum of n consecutive primes, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A070281 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mSum = 0;
  private long mP = 1;
  private long mN = 0;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    mSum += mP; // sum of first n primes
    if ((++mN & 1) == 0) {
      return mPrime.isPrime(mSum) ? Z.valueOf(mSum) : Z.ZERO;
    }
    long s = mSum;
    long q = mP;
    long p = 1;
    while (true) {
      if (mPrime.isPrime(s)) {
        return Z.valueOf(s);
      }
      p = mPrime.nextPrime(p);
      q = mPrime.nextPrime(q);
      s -= p;
      s += q;
    }
  }
}
