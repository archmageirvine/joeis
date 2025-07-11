package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078629 Number of ways to lace a shoe that has n pairs of eyelets, assuming the lacing satisfies certain conditions.
 * @author Sean A. Irvine
 */
public class A078629 extends Sequence1 {

  // Afer https://oeis.org/A078629/a078629.txt by N. J. A. Sloane

  private int mN = 0;
  protected int[] mPerm;

  private boolean nextPermutation(final int n) {
    int i = n - 2;
    while (i >= 0 && mPerm[i] >= mPerm[i + 1]) {
      --i;
    }
    if (i < 0) {
      return false;
    }
    int j = n - 1;
    while (mPerm[j] <= mPerm[i]) {
      --j;
    }
    final int tmp = mPerm[i];
    mPerm[i] = mPerm[j];
    mPerm[j] = tmp;
    for (int l = i + 1, r = n - 1; l < r; ++l, --r) {
      final int tmp1 = mPerm[l];
      mPerm[l] = mPerm[r];
      mPerm[r] = tmp1;
    }
    return true;
  }

  protected boolean accept(final int n, final int ntrue) {
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    mPerm = new int[2 * mN + 2];
    final int ntrue = 2 * mN;
    final int n = ntrue - 1;
    long count = 0;

    mPerm[ntrue - 1] = 2 * mN;
    for (int i1 = 0; i1 < n; ++i1) {
      mPerm[i1] = i1 + 1;
    }

    do {
      mPerm[ntrue] = mPerm[0];
      mPerm[ntrue + 1] = mPerm[1];
      boolean reject = false;
      for (int i = 0; i < ntrue; ++i) {
        // Increasing triple
        if (mPerm[i] == mPerm[i + 1] - 1 && mPerm[i] == mPerm[i + 2] - 2 && (mPerm[i + 2] <= mN || mPerm[i] >= mN + 1)) {
          reject = true;
          break;
        }
        // Decreasing triple
        if (mPerm[i] == mPerm[i + 1] + 1 && mPerm[i] == mPerm[i + 2] + 2 && (mPerm[i] <= mN || mPerm[i] >= mN + 3)) {
          reject = true;
          break;
        }
      }
      if (!reject && accept(mN, ntrue)) {
        ++count;
      }
    } while (nextPermutation(n));

    return Z.valueOf(count);
  }
}

