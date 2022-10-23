package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A058257 Triangle read by rows: this is a variant of A008280 in which 2 rows go from left to right, 2 from right to left, 2 from left to right, etc.
 * @author Sean A. Irvine
 */
public class A058257 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private Z[] mRow = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      mM = 0;
      if (++mN == 0) {
        mRow = new Z[] {Z.ONE};
      } else {
        final Z[] next = new Z[mN + 1];
        final long r = mN & 3;
        if (r == 1 || r == 2) {
          next[0] = Z.ZERO;
          for (int k = 0; k < mRow.length; ++k) {
            next[k + 1] = next[k].add(mRow[k]);
          }
        } else {
          final Z sum = ZUtils.sum(mRow);
          next[0] = sum;
          for (int k = 0; k < mRow.length; ++k) {
            next[k + 1] = next[k].subtract(mRow[k]);
          }
        }
        mRow = next;
      }
    }
    return mRow[mM];
  }
}

