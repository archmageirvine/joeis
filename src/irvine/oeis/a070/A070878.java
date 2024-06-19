package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070878 Stern's diatomic array read by rows (version 2).
 * @author Sean A. Irvine
 */
public class A070878 extends Sequence0 {

  private int mN = -1;
  private long[] mRow = {1, 0};

  @Override
  public Z next() {
    if (++mN >= mRow.length) {
      final long[] newRow = new long[2 * mRow.length - 1];
      for (int k = 0, j = 0; k < mRow.length - 1; k++) {
        newRow[j++] = mRow[k];
        newRow[j++] = mRow[k] + mRow[(k + 1) % mRow.length];
      }
      mRow = newRow;
      mN = 0;
    }
    return Z.valueOf(mRow[mN]);
  }
}
