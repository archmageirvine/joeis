package irvine.oeis.a389;

import java.util.ArrayList;

import irvine.math.z.Z;

/**
 * A389805 allocated for Hu Junhua.
 * @author Sean A. Irvine
 */
public class A389805 extends A389802 {

  private int mN = 0;
  private long mS = 0;
  private long mCount = 0;
  private ArrayList<Long> mIrred = null;

  private void search(final long used, final int pos) {
    if (used == mS) {
      ++mCount;
      return;
    }
    for (int k = pos; k < mIrred.size(); ++k) {
      final long v = mIrred.get(k);
      if ((used & v) == 0) {
        search(used | v, k + 1);
      }
    }
  }

  @Override
  public Z next() {
    mS = (1L << ++mN) - 1;
    mCount = 0;
    mIrred = new ArrayList<>(buildIrreducibleBalancedSamples(mN));
    search(0, 0);
    return Z.valueOf(mCount);
  }
}
