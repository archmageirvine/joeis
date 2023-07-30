package irvine.oeis.a064;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064817 Maximal number of squares among the n-1 numbers p_i + p_{i+1}, 1 &lt;= i &lt;= n-1, where (p_1, ..., p_n) is any permutation of (1, ..., n).
 * @author Sean A. Irvine
 */
public class A064817 extends Sequence1 {

  private int mN = 0;
  private int mMax = 0;
  private boolean[] mUsed = {};

  private void search(final int v, final int sum, final int used) {
    if (used == mUsed.length) {
      if (sum < mMax) {
        mMax = sum;
      }
      return;
    }
    if (sum - (mUsed.length - used) >= mMax) {
      return;
    }
    for (int k = 1; k < mUsed.length; ++k) {
      if (!mUsed[k]) {
        final int p = IntegerUtils.isSquare(v + k) ? -1 : 0;
        mUsed[k] = true;
        search(k, sum + p, used + 1);
        mUsed[k] = false;
      }
    }
  }

  @Override
  public Z next() {
    if (++mN > 500) {
      throw new UnsupportedOperationException();
    }
    if (mN >= 25) {
      return Z.valueOf(mN - 1); // Rob Pratt
    }
    mMax = mN;
    mUsed = new boolean[mN + 1];
    mUsed[0] = true;
    search(0, 0, 1);
    return Z.valueOf(-mMax - 1);
  }
}
