package irvine.oeis.a013;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

import irvine.math.z.Z;

/**
 * A013993 Number of edge-disjoint paths between opposite corners of 4 X n grid.
 * @author Sean A. Irvine
 */
public class A013993 extends A013990 {

  private Map<Comb, Integer> mCode = null;
  private int[][] mTransitions = null;
  private Z[] mCounts = null;
  private int mN = -1;

  protected int height() {
    return 4;
  }

  @Override
  public Z next() {
    if (++mN <= 0) {
      final Collection<Comb> combs = combs(height() + 1);
      mCode = combToCode(combs);
      mTransitions = packTransitions(mCode, successors(mCode, combs, height() + 1));
      mCounts = new Z[mCode.size()];
      Arrays.fill(mCounts, Z.ZERO);
      mCounts[mCode.get(new Comb(0))] = Z.ONE;
      return Z.ONE;
    }
    final Z[] newCounts = new Z[mCounts.length];
    Arrays.fill(newCounts, Z.ZERO);
    for (int j = 0; j < mCounts.length; ++j) {
      final int[] t = mTransitions[j];
      for (int i = 0; i < t.length; i += 2) {
        newCounts[j] = newCounts[j].add(mCounts[t[i]].multiply(t[i + 1]));
      }
    }
    mCounts = newCounts;
    return mCounts[mCode.get(new Comb(height()))];
  }
}
