package irvine.math;

import irvine.math.z.Z;

/**
 * Compute the number of reduced Latin rectangles for small values.
 * @author Sean A. Irvine
 */
public class ReducedLatinRectangles {

  // This is a toy implementation that can only get a few terms.
  // It performs a depth-first search using the definition:
  // A reduced Latin square of order n is an n X n matrix where each row and
  // column is a permutation of 1..n and the first row and column are 1..n
  // in increasing order.
  // However, rather than 1..n, we use 0..n-1.  We keep track using bits
  // which numbers have appeared in each row and column, but do not actually
  // construct the square explicitly.
  // Much better graph theoretic approaches are known (see McKay and Wanless).

  private final int mWidth;
  private final int mHeight;
  private final int mLimit;
  private final int[] mRowSyndromes;
  private final int[] mColSyndromes;
  private long mCount = 0;

  /**
   * Construct a new counter for reduced Latin rectangles.
   * @param rows number of rows
   * @param cols number of columns
   */
  public ReducedLatinRectangles(final int rows, final int cols) {
    if (rows > 9) {
      // R(10,10) requires more than 63 bits
      throw new UnsupportedOperationException();
    }
    if (rows < cols) {
      throw new ArithmeticException("Require cols < rows");
    }
    mHeight = rows;
    mWidth = cols;
    mRowSyndromes = new int[mHeight];
    mColSyndromes = new int[mWidth];
    mLimit = 1 << rows;
    mRowSyndromes[0] = mLimit - 1; // initial row has 0..n-1
    for (int k = 0; k < mColSyndromes.length; ++k) {
      mColSyndromes[k] = 1 << k;
    }
  }

  private void search(final int x, final int y) {
    if (x == mWidth) {
      search(0, y + 1);
      return;
    }
    if (y == mHeight) {
      ++mCount;
      return;
    }
    if (x == 0) {
      // row y starts with y
      mRowSyndromes[y] = 1 << y;
      //mColSyndromes[x] |= 1; // don't really need to keep track of col 0
      search(1, y);
      mRowSyndromes[y] &= ~(1 << y);
      //mColSyndromes[x] &= ~1;
    } else {
      for (int b = 1; b < mLimit; b <<= 1) {
        if ((mRowSyndromes[y] & b) == 0 && (mColSyndromes[x] & b) == 0) {
          mRowSyndromes[y] |= b;
          mColSyndromes[x] |= b;
          search(x + 1, y);
          mRowSyndromes[y] &= ~b;
          mColSyndromes[x] &= ~b;
        }
      }
    }
  }

  /**
   * Count the number of reduced Latin rectangle.
   * @return the count
   */
  public Z count() {
    search(0, 1);
    return Z.valueOf(mCount);
  }
}
