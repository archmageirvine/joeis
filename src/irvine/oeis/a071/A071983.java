package irvine.oeis.a071;

import java.util.ArrayList;
import java.util.List;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A071926.
 * @author Sean A. Irvine
 */
public class A071983 extends AbstractSequence {

  /** Construct the sequence. */
  public A071983() {
    super(15);
  }

  private int mN = 14;
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
      ++mCount;
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
    for (int k = 1; k <= mN; ++k) {
      search(k, 1L << (k - 1));
    }
    return Z.valueOf(mCount / 2);
  }
}
