package irvine.oeis.a068;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068029 Table of sorted score sequences (including duplications), with A000571 giving the number of score sequences of length n.
 * @author Sean A. Irvine
 */
public class A068029 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final ArrayList<Integer> mA = new ArrayList<>();
  private int[] mS;

  private void genScore(final int k, final int sum) {
    if (k == mN) {
      mS[mN] = mN * (mN - 1) / 2 - sum;
      for (int i = 1; i < mS.length; ++i) {
        mA.add(mS[i]);
      }
      return;
    }
    final int start = Math.max(mS[k - 1], k * (k - 1) / 2 - sum);
    for (int i = start; i <= (mN * (mN - 1) / 2 - sum) / (mN - k + 1); ++i) {
      mS[k] = i;
      genScore(k + 1, sum + i);
    }
  }

  @Override
  public Z next() {
    if (++mM >= mA.size()) {
      ++mN;
      mS = new int[mN + 1];
      mA.clear();
      genScore(1, 0);
      mM = 0;
    }
    if (mA.isEmpty()) {
      return Z.NEG_ONE;
    }
    return Z.valueOf(mA.get(mM));
  }
}

