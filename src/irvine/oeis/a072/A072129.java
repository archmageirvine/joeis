package irvine.oeis.a072;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072129 Number of distinct ways of arranging the squares {1,4,9,...,(2n)^2} in a circle so that the sum of each two adjacent entries is a prime.
 * @author Sean A. Irvine
 */
public class A072129 extends Sequence1 {

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

  private void search(final int prev, final long used) {
    if (used == mLimit) {
      for (final int v : mTransitions[prev - 1]) {
        if (v == 1) {
          ++mCount;
          break;
        }
      }
      return;
    }
    for (final int v : mTransitions[prev - 1]) {
      if ((used & (1L << (v - 1))) == 0) {
        search(v, used | (1L << (v - 1)));
      }
    }
  }

  @Override
  public Z next() {
    mN += 2;
    if (mN >= Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    if (mN == 2) {
      return Z.ONE;
    }
    mCount = 0;
    mLimit = (1L << mN) - 1;
    mTransitions = buildTransitions(mN);
    search(1, 1L); // first element is always 1
    return Z.valueOf(mCount / 2);  // Forward/reverse symmetry
  }
}
