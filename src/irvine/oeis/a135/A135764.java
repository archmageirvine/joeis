package irvine.oeis.a135;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A135764.
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

