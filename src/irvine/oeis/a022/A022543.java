package irvine.oeis.a022;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022543 Number of distinct 'failure tables' for a string of length <code>n</code>.
 * @author Sean A. Irvine
 */
public class A022543 implements Sequence {

  // After Pavel Irzavski

  private int mN = 0;
  private final int[] mA = new int[64];
  private final int[] mP = new int[64];

  // check(p, n) returns true if and only if there exists a string of length n that have provided failure table (assuming that p[0] == -1).
  private boolean check(final int[] p, final int n) {
    IntegerUtils.identity(mA);
    for (int i = 1, k = 0; i <= n; ++i) {
      while (k >= p[i]) {
        k = p[k];
      }
      if (++k != p[i]) {
        return false;
      }
      if (k != 0) {
        mA[i] = mA[k];
      }
    }
    for (int i = 1, k = 0; i <= n; ++i, ++k) {
      for (; k >= p[i]; k = p[k]) {
        if (k + 1 < i && mA[k + 1] == mA[i]) {
          return false;
        }
      }
    }
    return true;
  }

  // count(n) returns number of different failure tables for string of length n.
  private Z count(final int n, final int i) {
    mP[0] = -1;
    if (!check(mP, i - 1)) {
      return Z.ZERO;
    }
    if (i > n) {
      return Z.ONE;
    }
    Z result = Z.ZERO;
    for (mP[i] = 0; mP[i] <= mP[i - 1] + 1; ++mP[i]) {
      result = result.add(count(n, i + 1));
    }
    return result;
  }

  @Override
  public Z next() {
    return count(++mN, 1);
  }
}
