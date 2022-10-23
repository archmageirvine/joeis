package irvine.oeis.a135;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A135764 Distribute the natural numbers in columns based on the occurrence of "2" in each prime factorization; square array A(row,col) = 2^(row-1) * ((2*col)-1), read by descending antidiagonals.
 * @author Sean A. Irvine
 */
public class A135764 extends Sequence1 {

  private final ArrayList<ArrayList<Z>> mTable = new ArrayList<>();
  private Z mN = Z.ZERO;
  private int mRow = -1;
  private int mCol = 0;

  @Override
  public Z next() {
    if (++mCol > mRow) {
      ++mRow;
      mCol = 0;
    }
    while (mTable.size() <= mCol || mTable.get(mCol).size() <= mRow - mCol) {
      mN = mN.add(1);
      mN.makeOdd();
      final int twos = (int) mN.auxiliary();
      while (mTable.size() <= twos) {
        mTable.add(new ArrayList<>());
      }
      mTable.get(twos).add(mN);
    }
    return mTable.get(mCol).get(mRow - mCol);
  }
}

