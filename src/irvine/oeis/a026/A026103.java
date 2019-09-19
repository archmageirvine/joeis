package irvine.oeis.a026;

import java.util.ArrayList;

import irvine.math.z.Z;

/**
 * A026103 <code>a(n) = T(n,1) + T(n-1,2) + ...+ T(n-k+1,k)</code>, where k <code>= floor((n+1)/2)</code> and T is the array defined in <code>A026098</code>.
 * @author Sean A. Irvine
 */
public class A026103 extends A026098 {

  private final ArrayList<Z> mDiagonalSum = new ArrayList<>();
  private int mRow = -1;

  @Override
  public Z next() {
    ++mRow;
    for (int k = 0, j = mRow; k <= mRow; ++k, ++j) {
      if (j == mDiagonalSum.size()) {
        mDiagonalSum.add(super.next());
      } else {
        mDiagonalSum.set(j, mDiagonalSum.get(j).add(super.next()));
      }
    }
    return mDiagonalSum.get(mRow);
  }
}
