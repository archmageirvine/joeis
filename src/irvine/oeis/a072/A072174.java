package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072140.
 * @author Sean A. Irvine
 */
public class A072174 extends Sequence1 {

  // Brute force, no good for more than a few terms

  private static final int[] DELTA_X = {2, 2, -2,-2, 1, 1, -1, -1};
  private static final int[] DELTA_Y = {1, -1, 1, -1, 2, -2, 2, -2};
  private static final int[] DELTA_S = {0, 0, 0, 0, 1, 1, 1, 1}; // Which dimension steps 2
  private static final int[] DELTA_T = {1, 1, -1, -1, 1, -1, 1, -1}; // Half-step in 2 direction
  private int mN = 0;
  private int mMax = 0;
  private boolean[][] mUsed;

  private void search(final int x, final int y, final int len) {
    if (len > mMax) {
      mMax = len;
    }
    for (int k = 0; k < DELTA_X.length; ++k) {
      final int nx = x + DELTA_X[k];
      if (nx >= 0 && nx < mN) {
        final int ny = y + DELTA_Y[k];
        if (ny >= 0 && ny < mN && !mUsed[nx][ny]) {
          // Now check we can avoid stepping over a used cell
          final int s = DELTA_S[k];
          final int t = DELTA_T[k];
          if (s == 0) {
            if ((mUsed[x + t][y] || mUsed[nx][y]) && (mUsed[x + t][ny] || mUsed[x][ny])) {
              continue;
            }
          } else {
            if ((mUsed[x][y + t] || mUsed[x][ny]) && (mUsed[nx][y + t] || mUsed[nx][y])) {
              continue;
            }
          }
          mUsed[nx][ny] = true;
          search(nx, ny, len + 1);
          mUsed[nx][ny] = false;
        }
      }
    }
  }

  @Override
  public Z next() {
    mUsed = new boolean[++mN][mN];
    // Restrict starting point to an octant
    for (int k = 0; k <= mN / 2; ++k) {
      for (int j = 0; j <= k; ++j) {
        mUsed[k][j] = true;
        search(k, j, 1);
        mUsed[k][j] = false;
      }
    }
    return Z.valueOf(mMax);
  }
}
