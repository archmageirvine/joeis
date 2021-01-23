package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005164 Number of alternating sign 2n+1 X 2n+1 matrices invariant under all symmetries of the square.
 * @author Sean A. Irvine
 */
public class A005164 implements Sequence {

  // An explicit search, we use 1, 2, 3 to denote the values in the matrix
  // reserving 0 for an unfilled cell.  Simple search that attempts to
  // sequentially fill the matrix apply symmetries as it goes.

  // This is too slow for more than a few terms

  private int mN = -1;
  private long mCount = 0;

  private void search(final byte[][] matrix, final int x, final int y, final int prev) {
    if (y >= mN) {
      //System.out.println(Arrays.deepToString(matrix));
      ++mCount;
      return;
    }
    if (x >= mN) {
      if (rowVerify(matrix, y)) {
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
        matrix[y][x] = v;
        matrix[mN - x - 1][y] = v;
        matrix[x][mN - y - 1] = v;
        matrix[mN - x - 1][mN - y - 1] = v;
        matrix[y][mN - x - 1] = v;
        matrix[mN - y - 1][x] = v;
        matrix[mN - y - 1][mN - x - 1] = v;
        search(matrix, x + 1, y, v == 2 ? prev : v);
      }
    }
    matrix[x][y] = 0;
  }

  static boolean rowVerify(final byte[][] matrix, final int y) {
    // 1,2,3 -> -1,0,1
    int prev = 0;
    int sum = 0;
    final byte[] row = matrix[y];
    for (final byte u : row) {
      final int v = u - 2;
      if (v != 0) {
        if (prev == v) {
          return false;
        }
        prev = v;
      }
      sum += v;
    }
    return sum == 1;
  }

  @Override
  public Z next() {
    mN += 2;
    mCount = 0;
    final byte[][] matrix = new byte[mN][mN];
    search(matrix, 0, 0, 0);
    return Z.valueOf(mCount);
  }

}
