package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A073467 a(n) is the number of essentially different ways in which the integers 1,2,3,...,2n can be arranged in a circle such that (1) all pairs of adjacent integers sum to a prime number and (2) all pairs of integers opposite each other on the circle sum to a prime.
 * @author Sean A. Irvine
 */
public class A073467 implements Sequence {

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private int[] mNums = null;
  private long mCount = 0;

  private void search(final int pos, final long used) {
    if (pos == 2 * mN) {
      if (mNums[mNums.length - 1] >= mNums[1] && mPrime.isPrime(mNums[mNums.length - 1] + 1)) {  // +1 is mNums[0]
        ++mCount;
      }
      return;
    }
    for (int k = 2; k <= 2 * mN; ++k) {
      final long bit = 1L << (k - 1);
      if ((used & bit) == 0 && mPrime.isPrime(mNums[pos - 1] + k) && (pos < mN || mPrime.isPrime(mNums[pos - mN] + k))) {
        mNums[pos] = k;
        search(pos + 1, used | bit);
      }
    }
  }

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      return Z.ZERO;
    }
    mNums = new int[2 * mN];
    mNums[0] = 1;
    mCount = 0;
    search(1, 1);
    return Z.valueOf(mCount);
  }
}

