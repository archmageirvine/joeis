package irvine.oeis.a071;

import java.util.ArrayList;
import java.util.List;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A071984 Square loops: the number of circular permutations (reversals not counted as different) of the numbers 1 to n such that the sum of any two consecutive numbers is a square.
 * @author Sean A. Irvine
 */
public class A071984 extends AbstractSequence {

  /** Construct the sequence. */
  public A071984() {
    super(32);
  }

  private int mN = 31;
  private long mLimit = 0;
  private long mCount = 0;
  private int[][] mTransitions;

  private int[][] buildTransitions(final int n) {
    final int[][] transitions = new int[n][];
    for (int k = 1; k <= n; ++k) {
      final List<Integer> t = new ArrayList<>();
      for (int j = 1; j <= n; ++j) {
        if (j != k && Predicates.SQUARE.is(j + k)) {
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
    if (++mN >= Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    mCount = 0;
    mLimit = (1L << mN) - 1;
    mTransitions = buildTransitions(mN);
    search(1, 1L); // first element is always 1
    return Z.valueOf(mCount / 2);  // Forward/reverse symmetry
  }
}
