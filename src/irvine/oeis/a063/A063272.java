package irvine.oeis.a063;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063272 Number of times most common final digit of primes appears in first n primes.
 * @author Sean A. Irvine
 */
public class A063272 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final long[] mCounts = new long[10];
  private long mBest = 0;
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final int r = (int) (mP % 10);
    if (++mCounts[r] > mBest) {
      mBest = mCounts[r];
    }
    return Z.valueOf(mBest);
  }
}
