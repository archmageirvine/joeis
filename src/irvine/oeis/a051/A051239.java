package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051239 Number of ways to arrange integers 1 through n so that the sum of each adjacent pair is prime, not counting reversals.
 * @author Sean A. Irvine
 */
public class A051239 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private long mCount = 0;

  private void search(final int first, final int prev, final boolean[] used, final int k) {
    if (k >= mN) {
      if (first < prev) {
        ++mCount;
      }
      return;
    }
    // Permutation must alternate odd, even, odd, even, ...
    // So search either 1, 3, 5, 7, ... or 2, 4, 6, ... depending on k
    for (int j = 1 + (prev & 1); j <= mN; j += 2) {
      if (!used[j] && mPrime.isPrime(j + prev)) {
        used[j] = true;
        search(first, j, used, k + 1);
        used[j] = false;
      }
    }
  }

  @Override
  public Z next() {
    if (++mN <= 3) {
      return Z.ONE;
    }
    final boolean[] used = new boolean[mN + 1];
    mCount = 0;
    for (int k = 1; k < mN; ++k) { // first can be even or odd
      used[k] = true;
      search(k, k, used, 1);
      used[k] = false;
    }
    return Z.valueOf(mCount);
  }
}
