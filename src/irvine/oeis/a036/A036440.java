package irvine.oeis.a036;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036440 Number of ways of arranging row n of the prime pyramid.
 * @author Sean A. Irvine
 */
public class A036440 implements Sequence {

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private long mCount = 0;

  private void search(final int prev, final boolean[] used, final int k) {
    if (k >= used.length - 1) {
      if (mPrime.isPrime(prev + mN)) {
        ++mCount;
      }
      return;
    }
    // Permutation must alternate odd, even, odd, even, ...
    // So search either 3, 5, 7, ... or 2, 4, 6, ... depending on k
    for (int j = 3 - (k & 1); j < mN; j += 2) {
      if (!used[j] && mPrime.isPrime(j + prev)) {
        used[j] = true;
        search(j, used, k + 1);
        used[j] = false;
      }
    }
  }

  @Override
  public Z next() {
    final boolean[] used = new boolean[++mN];
    // strictly used[1] and used[mN] should be true, but we never check them anyway
    mCount = 0;
    search(1, used, 1);
    return Z.valueOf(mCount);
  }
}
