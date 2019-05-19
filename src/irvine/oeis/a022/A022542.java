package irvine.oeis.a022;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022542.
 * @author Sean A. Irvine
 */
public class A022542 implements Sequence {

  // After Frans J. Fasse
  // http://www.iwriteiam.nl/CS_gen_c.txt

  private static final int MAX_N = 100;
  private static final int MAX_K = 200;

  private final int[] mA = new int[MAX_K];
  private final boolean[] mAEq = new boolean[MAX_K];
  private final boolean[][] mC = new boolean[MAX_K][MAX_N + 1];
  private long mNumSolutions;
  private long mLowNrSolutions;
  private int mN = 0;

  private void fillSolution(final int n, final int k, final int lb, final int i, final int tl, final int h) {
    if (i == k - 1) {
      if (tl <= h && tl >= lb) {
        mA[i] = tl;
        testSolution(n, k);
      }
    } else if (tl >= lb * (k - i)) {
      for (int t = h; t >= lb; --t) {
        mA[i] = t;
        fillSolution(n, k, lb, i + 1, tl - t, t);
      }
    }
  }

  private void genAllL(final int n, final int k) {
    fillSolution(n, k, n + 1, 0, n * (n + 1) / 2, 2 * n - 2);
  }

  private void generate(final int n) {
    final int maxK = (n + 1) / 2;
    for (int k = 1; k <= maxK; k++) {
      genAllL(n, k);
    }
  }

  private void select(final int up, final int k, final int low) {
    if (up < low) {
      ++mNumSolutions;
    } else {
      int nlow = 0;
      int p = 0;
      for (int i = 0; i < k; i++) {
        if (mA[i] == low) {
          if (++nlow > 1) {
            return;
          } else {
            p = i;
          }
        }
      }
      if (nlow == 1) {
        mC[p][low] = true;
        mA[p] -= low;
        select(up, k, low + 1);
        mA[p] += low;
        mC[p][low] = false;
      } else {
        for (int i = 0; i < k; ++i) {
          if ((mA[i] == up || mA[i] >= up + low) && !mAEq[i]) {
            final boolean eq = mAEq[i + 1];
            mAEq[i + 1] = false;
            mC[i][up] = true;
            mA[i] -= up;
            select(up - 1, k, low);
            mA[i] += up;
            mC[i][up] = false;
            mAEq[i + 1] = eq;
          }
        }
      }
    }
  }

  private void testSolution(final int n, final int k) {
    for (int i = 0; i < k; i++) {
      Arrays.fill(mC[i], 0, n, false);
    }

    long numPerm = 1;
    int j = 1;
    mAEq[0] = false;
    for (int i = 1; i < k; i++) {
      if (mA[i - 1] == mA[i]) {
        numPerm *= ++j;
        mAEq[i] = true;
      } else {
        j = 1;
        mAEq[i] = false;
      }
    }
    mNumSolutions = 0;
    select(n, k, 1);

    if (mLowNrSolutions == 0 || numPerm * mNumSolutions < mLowNrSolutions) {
      mLowNrSolutions = numPerm * mNumSolutions;
    }
  }

  @Override
  public Z next() {
    mLowNrSolutions = 0;
    generate(++mN);
    return Z.valueOf(mLowNrSolutions);
  }
}
