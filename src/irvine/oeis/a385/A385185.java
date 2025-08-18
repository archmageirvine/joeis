package irvine.oeis.a385;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385185 Number of permutations of 0..n-1 which are binary Gray codes.
 * @author Sean A. Irvine
 */
public class A385185 extends Sequence1 {

  private int mN = 0;
  private long mMask = 0;
  private long mCount = 0;
  private int[][] mAdj = null;

  private int[][] buildAdjacencies(final int n) {
    final int[] work = new int[n];
    final int[][] adj = new int[n][];
    for (int k = 0; k < n; ++k) {
      int j = 0;
      for (int i = 0; i < n; ++i) {
        if (Long.bitCount(k ^ i) == 1) {
          work[j++] = i;
        }
      }
      adj[k] = Arrays.copyOf(work, j);
    }
    return adj;
  }

  private void search(final int prev, final long used) {
    if (used == mMask) {
      ++mCount;
      return;
    }
    for (final int j : mAdj[prev]) {
      if ((used & (1L << j)) == 0) {
        search(j, used | (1L << j));
      }
    }
  }

  @Override
  public Z next() {
    if (++mN >= Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    mMask = (1L << mN) - 1;
    if (mN > 2 && Predicates.POWER_OF_TWO.is(mN - 1)) {
      // a(2^n+1) = a(2^n)/2^(n-1)
      return Z.valueOf(mCount >>> (Functions.DIGIT_LENGTH.i(2, mN - 1) - 2));
    }
    mAdj = buildAdjacencies(mN);
    mCount = 0;
    final int parity = Long.bitCount(mN) & 1;
    for (int k = 0; k < mN; ++k) {
      if ((mN & 1) == 0 || (Long.bitCount(k) & 1) != parity) {
        search(k, 1L << k);
      }
    }
    return Z.valueOf(mCount);
  }
}
