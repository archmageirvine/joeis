package irvine.oeis.a152;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A152828 Triangle read by rows, A007318 rows repeated three times .
 * @author Georg Fischer
 */
public class A152828 extends BaseTriangle {

  private int mN;
  private int mFold;
  private int mFoldIndex; // 0..mFold-1
  private int mPascalRow; // current row number in Pascal's triangle

  /** Construct the sequence. */
  public A152828() {
    this(0, 3);
  }

  /**
   * Generic constructor with parameters
   * @param fold
   */
  public A152828(final int offset, final int fold) {
    super(offset, 0, 0);
    mN = -1;
    mRow = -1;
    mPascalRow = mRow;
    mFold = fold;
    mFoldIndex = fold;
    mCol = -1;
    mRowLen = -1;
    mHasRAM = false;
    mSizeFct = n -> mPascalRow + 1;
  }

  /**
   * Increase the row index, add a new, empty row and reset the column index.
   * The row length is <code>mRow + 1</code>.
   */
  protected void addRow() {
    ++mFoldIndex;
    if (mFoldIndex >= mFold) {
      mFoldIndex = 0;
      ++mPascalRow;
    }
    super.addRow();
  }

  /**
   * Compute an element of the BaseTriangle with shifted indexes.
   * In contrast to {@link #get} and {@link #compute}, the indexes are shifted by {@link #mRowShift}, {@link #mColShift}.
   * @param n shifted row index
   * @param k shifted column index
   * @return T(n, k)
   */
  public Z triangleElement(final int n, final int k) {
    if (mFoldIndex == 0) {
      if (k < 0 || k > mPascalRow) {
        return Z.ZERO;
      }
      if (k == 0 || k == mPascalRow) {
        return Z.ONE;
      }
      return get(n - 1, k - 1).add(get(n - 1, k)); // Pascal's rule
    } else {
      return get(n - 1, k); // copy from previous row
    }
  }

}
