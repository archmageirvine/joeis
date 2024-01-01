package irvine.oeis.a067;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067675 Number of fixed convex polyominoes with n cells.
 * @author Ruben Gr&oslash;nning Spaans
 * @author Sean A. Irvine (Java port)
 */
public class A067675 extends Sequence1 {

  // See https://github.com/stubbscroll/OEIS/blob/master/A067675.c

  private int mN = 0;
  private int mM = 8;
  
  /* DP state: [prev/cur][leftmost][rightmost][width][cells used]
     leftmost: 1 if the leftmost part of the current row is to the right
             of the leftmost part of the previous row (that is, we have
             passed the leftmost point)
     rightmost: similar
     width: width of last row
  */

  private Z[] mTable = {};

  /* precalculate helper values for main algorithm so that we can do innermost
     loop in O(1) with table lookup. Pre-calculation is O(n^3), less than the
     main algorithm. */
  private int[][][][][][] precalc(final int n) {
    final int[][][][][][] mDp2 = new int[2][2][2][2][n][n];
    for (int i = 0; i < 2; ++i) {
      for (int j = 0; j < 2; ++j) {
        for (int k = 1; k < n; ++k) {
          for (int m = 1; m < n; ++m) {
            /* given state i,j,k,m where i,j are current values of leftmost and
               rightmost, k is the width of the last row and m is the width of the
               current row, try all ways of placing the current row and count the
               number of times each of the 4 cases occur (new values of leftmost/
               rightmost) */
            if (i + j > 1 && m > k) {
              break;
            }
            for (int left = 1 - m; left < k; ++left) {
              if (left < 0 && i != 0) {
                continue;
              }
              final int right = left + m;
              if (right > k && j != 0) {
                continue;
              }
              final int forceleft = left > 0 ? 1 : i;
              final int forceright = right < k ? 1 : j;
              ++mDp2[forceleft][forceright][i][j][k][m];
            }
          }
        }
      }
    }
    return mDp2;
  }

  /* calculate a(1) ... a(n) with DP
     time complexity: O(n^4):
     - do/while loop is executed n times
     - loop over n^2 states containing another n loop that
       generates states for the next iteration
     the bound is not necessarily tight, many states never occur.
     (can probably be reduced to O(n^3.5) with some symmetry and making sure
      that we only directly generate polyominoes with height<=width and do some
      very careful counting.)
     and then there's the complexity from the size of the terms, which I haven't
     thought about yet. I guess it depends on things like the complexity of
     gmp's multiply function among other things.
     disclaimer, there might be much better approaches.
  */
  private void calcterms(final int n) {
    final Z[][][][][] dp = new Z[2][2][2][n][n];
    /* initialize dp array */
    for (int i = 0; i < 2; ++i) {
      for (int j = 0; j < 2; ++j) {
        for (int k = 0; k < 2; ++k) {
          for (int l = 0; l < n; ++l) {
            Arrays.fill(dp[i][j][k][l], Z.ZERO);
          }
        }
      }
    }
    final int[][][][][][] dp2 = precalc(n);
    mTable = new Z[n];
    Arrays.fill(mTable, Z.ZERO);
    int cur = 1;
    int prev = 0;
    boolean done;
    /* initial dp with a top row of every possible length */
    for (int i = 1; i < n; ++i) {
      dp[prev][0][0][i][i] = Z.ONE;
    }
    do {
      done = true;
      /* initialize cur */
      for (int i = 0; i < 2; ++i) {
        for (int j = 0; j < 2; ++j) {
          for (int k = 0; k < n; ++k) {
            for (int l = 0; l < n; ++l) {
              dp[cur][i][j][k][l] = Z.ZERO;
            }
          }
        }
      }
      for (int i = 0; i < 2; ++i) {
        for (int j = 0; j < 2; ++j) {
          for (int k = 1; k < n; ++k) {
            for (int l = 1; l < n; ++l) {
              if (!dp[prev][i][j][k][l].isZero()) {
                done = false;
                /* finish off the current polyomino and put it in table */
                mTable[l] = mTable[l].add(dp[prev][i][j][k][l]);
                /* try all widths for next row */
                for (int m = 1; m < n - l; ++m) {
                  if (i + j > 1 && m > k) {
                    break;
                  }
                  if (dp2[0][0][i][j][k][m] != 0) {
                    dp[cur][0][0][m][l + m] = dp[cur][0][0][m][l + m].add(dp[prev][i][j][k][l].multiply(dp2[0][0][i][j][k][m]));
                  }
                  if (dp2[0][1][i][j][k][m] != 0) {
                    dp[cur][0][1][m][l + m] = dp[cur][0][1][m][l + m].add(dp[prev][i][j][k][l].multiply(dp2[0][1][i][j][k][m]));
                  }
                  if (dp2[1][0][i][j][k][m] != 0) {
                    dp[cur][1][0][m][l + m] = dp[cur][1][0][m][l + m].add(dp[prev][i][j][k][l].multiply(dp2[1][0][i][j][k][m]));
                  }
                  if (dp2[1][1][i][j][k][m] != 0) {
                    dp[cur][1][1][m][l + m] = dp[cur][1][1][m][l + m].add(dp[prev][i][j][k][l].multiply(dp2[1][1][i][j][k][m]));
                  }
                }
              }
            }
          }
        }
      }
      cur = prev;
      prev = 1 - cur;
    } while (!done);
  }

  @Override
  public Z next() {
    if (++mN >= mTable.length) {
      mM *= 2;
      calcterms(mM);
    }
    return mTable[mN];
  }
}
