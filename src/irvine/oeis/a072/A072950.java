package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072950 Number of permutations p of (1,2,3,...,n) such that at least one value of abs(k-p(k)) is prime.
 * @author Sean A. Irvine
 */
public class A072950 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private Z mCount = Z.ZERO;

  private void search(final int remaining, final long used) {
    if (remaining == 0) {
      return;
    }
    // Consider possible elements for position mN - remaining
    final int pos = mN - remaining;
    for (int k = 0; k < mN; ++k) {
      if ((used & (1L << k)) == 0) {
        // We have not yet used element k
        if (mPrime.isPrime(Math.abs(pos - k))) {
          // Found a prime, remaining elements can be in any order
          mCount = mCount.add(Functions.FACTORIAL.z(remaining - 1));
        } else {
          search(remaining - 1, used | (1L << k));
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mN >= Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    mCount = Z.ZERO;
    search(mN, 0L);
    return mCount;
  }
}

