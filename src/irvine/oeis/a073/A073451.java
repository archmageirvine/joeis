package irvine.oeis.a073;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073451 Number of essentially different ways in which the squares 1,4,9,...,n^2 can be arranged in a sequence such that all pairs of adjacent squares sum to a prime number. Rotations and reversals are counted only once.
 * @author Sean A. Irvine
 */
public class A073451 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private long mLimit = 0;
  private long mCount = 0;
  private int[][] mTransitions;

  private int[][] buildTransitions(final int n) {
    final int[][] transitions = new int[n][];
    for (int k = 1; k <= n; ++k) {
      final List<Integer> t = new ArrayList<>();
      for (int j = 1; j <= n; ++j) {
        if (j != k && mPrime.isPrime((long) j * j + (long) k * k)) {
          t.add(j);
        }
      }
      transitions[k - 1] = new int[t.size()];
      for (int j = 0; j < t.size(); ++j) {
        transitions[k - 1][j] = t.get(j);
      }
    }
    return transitions;
  }

  private void search(final int start, final int prev, final long used) {
    if (used == mLimit) {
      boolean circular = false;
      for (final int v : mTransitions[prev - 1]) {
        if (v == start) {
          circular = true;
          break;
        }
      }
      if (!circular || start == 1) {
        ++mCount;
      }
    }
    for (final int v : mTransitions[prev - 1]) {
      if ((used & (1L << (v - 1))) == 0) {
        search(start, v, used | (1L << (v - 1)));
      }
    }
  }

  @Override
  public Z next() {
    if (++mN >= Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    if (mN <= 4) {
      return Z.ONE;
    }
    mCount = 0;
    mLimit = (1L << mN) - 1;
    mTransitions = buildTransitions(mN);
    for (int k = 1; k <= mN; ++k) {
      search(k, k, 1L << (k - 1));
    }
    return Z.valueOf(mCount / 2); // Apply reversal symmetry
  }
}
