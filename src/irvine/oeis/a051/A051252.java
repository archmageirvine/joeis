package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051252 Number of essentially different ways of arranging numbers 1 through 2n around a circle so that sum of each pair of adjacent numbers is prime.
 * @author Sean A. Irvine
 */
public class A051252 implements Sequence {

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private long mCount = 0;

  private void search(final int first, final int prev, final long used, final int k) {
    if (k >= mN) {
      if (first <= prev && mPrime.isPrime(1 + prev)) {
        ++mCount;
      }
      return;
    }
    // Permutation must alternate odd, even, odd, even, ...
    // So search either 1, 3, 5, 7, ... or 2, 4, 6, ... depending on k
    for (int j = 1 + (prev & 1); j <= mN; j += 2) {
      if ((used & (1L << j)) == 0 && mPrime.isPrime(j + prev)) {
        search(first == 0 ? j : first, j, used | (1L << j), k + 1);
      }
    }
  }

  @Override
  public Z next() {
    mN += 2;
    mCount = 0;
    search(0, 1, 2L, 1);
    return Z.valueOf(mCount);
  }
}
