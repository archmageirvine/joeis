package irvine.oeis.a135;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A135764 Distribute the natural numbers in columns based on the occurrence of <code>"2"</code> in each prime factorization; square array <code>A(row,col) = 2^(row-1) * ((2*col)-1)</code>, read by antidiagonals <code>A(1,1), A(1,2), A(2,1), A(1,3), A(2,2), A(3,1)</code>, ...
 * @author Sean A. Irvine
 */
public class A135764 implements Sequence {

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

