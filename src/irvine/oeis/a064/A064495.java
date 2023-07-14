package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064495 Prime(n^2) +/- n are primes.
 * @author Sean A. Irvine
 */
public class A064495 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mM = 0;
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      final long s = ++mN * mN;
      while (mM < s) {
        mP = mPrime.nextPrime(mP);
        ++mM;
      }
      if (mPrime.isPrime(mP - mN) && mPrime.isPrime(mP + mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
