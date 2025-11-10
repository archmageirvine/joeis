package irvine.oeis.a390;

import java.util.HashMap;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.ParallelPermutationSequence;

/**
 * A390187 Minimum number of distinct consecutive sums of a permutation of [n].
 * @author Sean A. Irvine
 */
public class A390187 extends ParallelPermutationSequence {

  private int mMin;

  /** Construct the sequence. */
  public A390187() {
    super(0);
  }

  private int count(final int[] p, final int sum, final int pos, final int localMin) {
    int distinct = 0;
    final boolean[] seen = new boolean[sum + 1 + pos];
    for (int k = 0; k < pos; ++k) {
      int s = 0;
      for (int j = k; j < pos; ++j) {
        s += p[j] + 1;
        if (!seen[s]) {
          seen[s] = true;
          if (++distinct > localMin) {
            return distinct;
          }
        }
      }
    }
    return distinct;
  }

  private final Map<Thread, Integer> mMins = new HashMap<>();

  @Override
  protected boolean accept(final int[] p, final int sum, final int pos) {
    if (p.length < 1) {
      return true;
    }

    // This includes some tricky stuff to try to reduce the need for synchronize
    // With all the following I get 75-95% utilization when run on 20 cores

    // Only bother checking every second pos
    // This is a tradeoff between not doing the distinct count too often and detecting above min
    if ((pos & 1) == 0 && pos != p.length) {
      return true;
    }

    final Thread t = Thread.currentThread();
    final Integer local = mMins.get(t);
    final int localMin; // It's enough that this is >= mMin
    if (local == null) {
      synchronized (A390187.this) {
        localMin = mMin;
      }
      mMins.put(t, localMin);
    } else {
      localMin = local;
    }
    final int distinct = count(p, sum, pos, localMin);
    if (distinct < localMin) {
      synchronized (A390187.this) {
        if (distinct >= mMin) {
          return false;
        }
        if (pos == p.length) {
          mMin = distinct;
          mMins.clear();
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    mMin = Functions.TRIANGULAR.i(mN + 1);
    super.next();
    return Z.valueOf(mMin);
  }
}

