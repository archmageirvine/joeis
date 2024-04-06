package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069118.
 * @author Sean A. Irvine
 */
public class A069124 extends Sequence1 {

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
    //System.out.println(Arrays.deepToString(mG));
  }

  private boolean isStable(final int[] wives, final int t) {
//    final int[] husbands = new int[wives.length]; // todo if this is needed construct it incrementally
//    for (int k = 0; k < wives.length; ++k) {
//      husbands[wives[k]] = k;
//    }
    for (int m = 0; m < t; ++m) {
      final int f = wives[m];
      final int s = mG[m][f]; // preference for current pairing

      // this version is close to expected numbers
      for (int k = 0; k < t; ++k) {
        if (k != m) {
          final int j = wives[k];
          if (mG[m][j] < s && mG[k][f] > s) {
            return false;
          }
        }
      }

      // this seems to match discussion but gets wrong answer
//      for (int k = 0; k < t; ++k) {
//        if (mG[m][k] < s && mG[husbands[k]][k] > s) {
//          return false;
//        }
//      }
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
        // todo incremental stability check
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

