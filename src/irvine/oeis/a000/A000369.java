package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000369 Triangle of numbers related to triangle A049213; generalization of Stirling numbers of second kind A008277, Bessel triangle A001497.
 * @author Sean A. Irvine
 */
public class A000369 extends Sequence1 {

  private int mRow = 1;
  private int mPos = 1;
  private ArrayList<Z> mCurrentRow = new ArrayList<>();
  {
    mCurrentRow.add(Z.ZERO);
    mCurrentRow.add(Z.ONE);
  }

  private Z get(final int n, final int m) {
    if (m <= 0 || m > n) {
      return Z.ZERO;
    }
    return mCurrentRow.get(m);
  }

  @Override
  public Z next() {
    if (mPos >= mCurrentRow.size()) {
      // Update to next row
      mPos = 1;
      final int n = mRow++;
      final ArrayList<Z> newRow = new ArrayList<>();
      for (int m = 0; m <= mRow; ++m) {
        newRow.add(get(n, m).multiply(4L * n - m).add(get(n, m - 1)));
      }
      mCurrentRow = newRow;
    }
    return mCurrentRow.get(mPos++);
  }
}
