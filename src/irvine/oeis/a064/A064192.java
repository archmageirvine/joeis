package irvine.oeis.a064;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.a008.A008282;

/**
 * A064192 Triangle in which rows are permutations of the rows of A008282.
 * @author Sean A. Irvine
 */
public class A064192 extends A008282 {

  private Z[] mRow = new Z[0];
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mRow = Arrays.copyOf(mRow, mRow.length + 1);
      for (int k = 0; k < mRow.length; ++k) {
        mRow[k] = super.next();
      }
      mM = 0;
    }
    // Alternate picking elements from left and right of row in A008282
    return mRow[(mM & 1) == 0 ? mRow.length - 1 - mM / 2 : mM / 2];
  }
}

