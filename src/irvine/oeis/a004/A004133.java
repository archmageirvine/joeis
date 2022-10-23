package irvine.oeis.a004;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A004133 Additive bases: a(n) is the least integer such that there is an n-element set of nonnegative integers, the sums of pairs (of distinct elements) of which are distinct and at most a(n).
 * @author Sean A. Irvine
 */
public class A004133 extends Sequence2 {

  private final boolean[] mSeen = new boolean[1000000];
  private int mN = 1;
  private int mBest = mSeen.length;

  private int canUse(final Set<Integer> set, final int maxUsed, final int k) {
    int m = maxUsed;
    for (final int j : set) {
      if (mSeen[j + k]) {
        for (final int i : set) {
          if (i == j) {
            return -1;
          }
          mSeen[i + k] = false;
        }
      }
      mSeen[j + k] = true;
      if (j + k > m) {
        m = j + k;
      }
    }
    return m;
  }

  private void search(final Set<Integer> set, final int nextValue, final int remaining, final int maxUsed) {
    if (remaining == 0) {
      if (maxUsed < mBest) {
        mBest = maxUsed;
      }
      return;
    }
    for (int k = nextValue; k <= mBest; ++k) {
      final int m = canUse(set, maxUsed, k);
      if (m >= 0) {
        set.add(k);
        search(set, k + 1, remaining - 1, m);
        set.remove(k);
        for (final int j : set) {
          mSeen[j + k] = false;
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    final HashSet<Integer> set = new HashSet<>();
    set.add(0);
    set.add(1);
    mBest = mSeen.length; // reasonable upper bound for now
    mSeen[0] = true;
    mSeen[1] = true;
    search(set, 2, mN - 2, 1);
    return Z.valueOf(mBest);
  }
}
