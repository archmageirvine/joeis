package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A000369 Triangle of numbers related to triangle <code>A049213</code>; generalization of Stirling numbers of second kind <code>A008277</code>, Bessel triangle <code>A001497</code>.
 * @author Sean A. Irvine
 */
public class A000369 implements Sequence {

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
