package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005160.
 * @author Sean A. Irvine
 */
public class A005160 implements Sequence {

  // An explicit search, we use 1, 2, 3 to denote the values in the matrix
  // reserving 0 for an unfilled cell.  Simple search that attempts to
  // sequentially fill the matrix apply symmetries as it goes.

  // This is too slow for more than a few terms

  private int mN = 0;
  private long mCount = 0;

  private void search(final byte[][] matrix, final int x, final int y, final int prev) {
    if (y >= mN) {
      ++mCount;
      return;
    }
    if (x >= mN) {
      if (A005164.rowVerify(matrix, y)) {
        search(matrix, 0, y + 1, 0);
      }
      return;
    }
    if (matrix[x][y] != 0) {
      search(matrix, x + 1, y, matrix[x][y] == 2 ? prev : matrix[x][y]);
      return;
    }
    for (byte v = 1; v <= 3; ++v) {
      if (v == 2 || prev != v) {
        matrix[x][y] = v;
        matrix[mN - x - 1][mN - y - 1] = v;
        matrix[y][mN - x - 1] = v;
        matrix[mN - y - 1][x] = v;
        search(matrix, x + 1, y, v == 2 ? prev : v);
      }
    }
    matrix[x][y] = 0;
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    final byte[][] matrix = new byte[mN][mN];
    search(matrix, 0, 0, 0);
    return Z.valueOf(mCount);
  }
}
