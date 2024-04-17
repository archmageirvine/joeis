package irvine.oeis.a371;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A371810 a(n) is the number of pseudo-Latin stable matchings in a particular matrix of size n (see Comments for detail).
 * @author Sean A. Irvine
 */
public class A371810 extends Sequence1 {

  private int[][] mG = {{1}};
  private int mN = 0;
  private long mCount = 0;

  private void updateG() {
    final int l = mG.length;
    final int[][] g = new int[l * 2][l * 2];
    for (int k = 0; k < l; ++k) {
      System.arraycopy(mG[k], 0, g[k], 0, l);
      System.arraycopy(mG[k], 0, g[l + k], l, l);
      for (int j = 0; j < l; ++j) {
        g[k][l + j] = mG[k][j] + l;
        g[l + k][j] = mG[k][j] + l;
      }
    }
    mG = g;
  }

  private boolean isStable(final int[] wives, final int t) {
    for (int m = 0; m < t; ++m) {
      final int f = wives[m];
      final int s = mG[m][f]; // preference for current pairing
      for (int k = 0; k < t; ++k) {
        if (k != m) {
          final int j = wives[k];
          if (mG[m][j] < s && mG[k][f] > s) {
            return false;
          }
        }
      }
    }
    return true;
  }

  private void countStable(final int male, final long usedFemales, final int[] wives) {
    if (male == mN) {
      if (isStable(wives, male)) {
        ++mCount;
      }
      return;
    }
    for (int f = 0; f < mN; ++f) {
      final long bit = 1L << f;
      if ((usedFemales & bit) == 0) {
        wives[male] = f;
        if (isStable(wives, male + 1)) {
          countStable(male + 1, usedFemales | bit, wives);
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mN > mG.length) {
      updateG();
    }
    mCount = 0;
    countStable(0, 0L, new int[mN]);
    return Z.valueOf(mCount);
  }
}

