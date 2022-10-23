package irvine.oeis.a202;
// manually 2021-10-20

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A202692 The first of three triangles counting 3-colored alternating permutations by their last value.
 * @author Georg Fischer
 */
public class A202692 extends Sequence1 {

  protected static final int MAX_GRIX = 3;
  protected int mGrix;
  protected Z[] mOldRow;
  protected Z[] mNewRow;
  protected int mRow;
  protected int mCol;

  /** Construct the sequence. */
  public A202692() {
    this(0, new long[] {1, 1, 1});
  }

  /**
   * Generic constructor with parameters
   * @param grix index in triangle group for <code>next()</code>
   * @param inits initial terms of <code>T[grix](0, 0)</code>
   */
  public A202692(final int grix, final long[] inits) {
    mGrix = grix;
    mNewRow = new Z[MAX_GRIX];
    for (int icn = 0; icn < MAX_GRIX; ++icn) {
      mNewRow[icn] = Z.valueOf(inits[icn]);
    }
    mRow = 0;
    mCol = 0;
  }

  /**
   * Add a new row over all 3 triangles
   */
  private void addRow() {
    ++mRow;
    mCol = 0;
    mOldRow = mNewRow;
    mNewRow = new Z[(mRow + 1) * MAX_GRIX];
    final int olen = mOldRow.length;
    final int nlen = mNewRow.length;
    int icn = 0;
    for (int ico = 0; ico < olen; ++ico) { // copy and insert zeroes
      if ((mRow & 1) == 1) { // odd row 1, 3 etc.: left to right, insert 0 before group
        if (ico % mRow == 0) {
          mNewRow[icn++] = Z.ZERO;
        }
        mNewRow[icn++] = mOldRow[ico];
      } else { // even row 2, 4 etc.: right to left, insert 0 behind group
        mNewRow[icn++] = mOldRow[ico];
        if (ico % mRow == mRow - 1) {
          mNewRow[icn++] = Z.ZERO;
        }
      }
    }
    Z sum = Z.ZERO;
    if ((mRow & 1) == 1) { // sum odd row
      for (icn = 0; icn < nlen; ++icn) {
        sum = sum.add(mNewRow[icn]);
        mNewRow[icn] = sum;
      }
    } else { // sum even row
      for (icn = nlen - 1; icn >= 0; --icn) {
        sum = sum.add(mNewRow[icn]);
        mNewRow[icn] = sum;
      }
    }
  }

  @Override
  public Z next() {
    final Z result = mNewRow[mGrix * (mRow + 1) + mCol];
    if (++mCol > mRow) {
      addRow();
    }
    return result;
  }
}
