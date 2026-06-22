package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395114 Irregular triangle, next row is the previous row with the difference between consecutive numbers inserted between, starting with row 1 1.
 * @author Sean A. Irvine
 */
public class A395114 extends Sequence1 {

  private int[] mRow = {1, 1};
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mM = 0;
      final int[] next = new int[mRow.length * 2 - 1];
      for (int k = 0; k < mRow.length; ++k) {
        next[2 * k] = mRow[k];
      }
      for (int k = 1; k < next.length; k += 2) {
        next[k] = next[k + 1] - next[k - 1];
      }
      mRow = next;
    }
    return Z.valueOf(mRow[mM]);
  }
}

