package irvine.oeis.a004;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004129.
 * @author Sean A. Irvine
 */
public class A004129 implements Sequence {

  private final int[] mSeen = new int[1000000];
  private int mN = 1;
  private int mBest = 0;

  private void search(final Set<Integer> set, final int nextValue, final int remaining, final int leastUnseen) {
    if (remaining == 0) {
      if (leastUnseen > mBest) {
        mBest = leastUnseen;
      }
      return;
    }
    for (int k = nextValue; k <= leastUnseen; ++k) {
      for (final int j : set) {
        mSeen[j + k]++;
      }
      set.add(k);
      int lu = leastUnseen;
      while (mSeen[lu] > 0) {
        ++lu;
      }
      search(set, k + 1, remaining - 1, lu);
      set.remove(k);
      for (final int j : set) {
        mSeen[j + k]--;
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    final HashSet<Integer> set = new HashSet<>();
    set.add(0);
    set.add(1);
    mBest = 2;
    mSeen[0] = 1;
    mSeen[1] = 1;
    search(set, 2, mN - 2, 2);
    return Z.valueOf(mBest - 1);
  }
}
