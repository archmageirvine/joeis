package irvine.oeis.a373;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A373182 allocated for Enrique Navarrete.
 * @author Sean A. Irvine
 */
public class A373182 extends Sequence1 {

  private int mN = 0;
  private long mCount = 0;

  private void search(final boolean[] used) {
    boolean max = true;
    for (int k = 2; k < mN; ++k) {
      if (!used[k] && !used[k - 1] && !used[k + 1]) {
        // Someone can sit at k
        used[k] = true;
        max = false;
        search(used);
        used[k] = false;
      }
    }
    if (max) {
      ++mCount;
    }
  }

  @Override
  public Z next() {
    final boolean[] used = new boolean[++mN + 1]; // + 1 to avoid bounds checking
    used[0] = true;
    used[1] = true;
    mCount = 0;
    search(used);
    return Z.valueOf(mCount);
  }
}
