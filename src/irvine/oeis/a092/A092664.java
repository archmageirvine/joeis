package irvine.oeis.a092;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A092664 Number of consecutive prime runs of 10 primes congruent to 3 mod 4 below 10^n.
 * @author Sean A. Irvine
 */
public class A092664 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mLimit = 1;
  private long mP = 2;
  private long mTotalCount = 0;
  private long mCurrentCount = 0;

  protected int targetCount() {
    return 10;
  }
  @Override
  public Z next() {
    long correction = 0;
    mLimit *= 10L;
    while (mP < mLimit) {
      mP = mPrime.nextPrime(mP);
      if ((mP & 3) == 1) {
        if (mCurrentCount == targetCount()) {
          ++mTotalCount;
          if (mP >= mLimit) {
            correction = 1;
          }
        }
        mCurrentCount = 0;
      } else {
        assert (mP & 3) == 3;
        ++mCurrentCount;
      }
    }
    return Z.valueOf(mTotalCount - correction);
  }
}

