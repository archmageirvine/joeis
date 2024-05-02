package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069344 Number of n X n symmetric binary arrays with path of adjacent 1's from upper right corner to lower left corner.
 * @author Sean A. Irvine
 */
public class A069344 extends Sequence1 {

  // Brute force, only good for a few terms

  // Note axis of symmetry is at right angles to the required path.
  // It should be possible to do something like A069295 here, but the details are tricky.
  // One could try constructing a diagonal at a time, but the rules for connectedness of the 1s are hard to handle

  private int mN = 0;

  private boolean isAdjacent1(final boolean[][] mat, final boolean[][] searched, final int r, final int c) {
    if (!mat[r][c]) {
      return false;
    }
    if (c == mat.length - 1) {
      return mat[0][c];
    }
    searched[r][c] = true;
    if (!searched[r][c + 1] && isAdjacent1(mat, searched, r, c + 1)) {
      return true;
    }
    if (r < mat.length - 1 && !searched[r + 1][c] && isAdjacent1(mat, searched, r + 1, c)) {
      return true;
    }
    if (r > 0 && !searched[r - 1][c] && isAdjacent1(mat, searched, r - 1, c)) {
      return true;
    }
    if (c > 0 && !searched[r][c - 1] && isAdjacent1(mat, searched, r, c - 1)) {
      return true;
    }
    searched[r][c] = false;
    return false;
  }

  // This explicit computation verifies Hardin value is correct in small cases
  private long countByBruteForce(final int size) {
    long cnt = 0;
    final boolean[][] mat = new boolean[size][size];
    for (long m = 1; m < 1L << (size * (size + 1) / 2); ++m) {
      long k = m;
      for (int r = 0; r < size; ++r) {
        for (int c = r; c < size; ++c) {
          mat[r][c] = (k & 1) == 1;
          mat[c][r] = (k & 1) == 1;
          k >>>= 1;
        }
      }
      if (isAdjacent1(mat, new boolean[size][size], size - 1, 0)) {
        ++cnt;
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    return Z.valueOf(countByBruteForce(++mN));
  }
}
