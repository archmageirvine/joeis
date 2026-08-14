package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086264 Number of real {0,1} n X n matrices having determinant=1.
 * @author Sean A. Irvine
 */
public class A086264 extends Sequence0 {

  // After Minfeng Wang

  private int mN = -1;
  private int[] mRow;
  private int[] mStr;
  private int mDet;
  private long mCount;

  private void dfs(final int idx, final int n) {
    if (idx == 0) {
      final int st = (mRow[n - 1] >>> (n - 2)) << (n - 2);
      final int r = Math.min(st, mRow[1]) - 1;
      for (mRow[0] = r; mRow[0] > 0; --mRow[0]) {
        determinant(n);
      }
      return;
    }

    for (mRow[idx] = mRow[idx + 1] - 1; mRow[idx] > 0; --mRow[idx]) {
      dfs(idx - 1, n);
    }
  }

  private void determinant(final int n) {
    mDet = 0;
    permutationDfs(0, n, 1);
    if (Math.abs(mDet) == 1) {
      ++mCount;
    }
  }

  private void permutationDfs(final int k, final int n, final int sign) {
    if (k == n) {
      mDet += sign;
      return;
    }

    if (((mRow[k] >>> mStr[k]) & 1) != 0) {
      permutationDfs(k + 1, n, sign);
    }

    for (int i = k + 1; i < n; ++i) {
      if (((mRow[k] >>> mStr[i]) & 1) != 0) {
        final int t = mStr[i];
        mStr[i] = mStr[k];
        mStr[k] = t;
        permutationDfs(k + 1, n, -sign);
        mStr[k] = mStr[i];
        mStr[i] = t;
      }
    }
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    mRow = new int[mN];
    mStr = new int[mN];
    for (int i = 0; i < mN; ++i) {
      mStr[i] = i;
    }
    mCount = 0;
    final int ub = 1 << mN;
    for (mRow[mN - 1] = ub - 1; (mRow[mN - 1] >>> (mN - 1)) != 0; --mRow[mN - 1]) {
      dfs(mN - 2, mN);
    }
    return Z.valueOf(mCount).multiply(Functions.FACTORIAL.z(mN)).divide2();
  }
}
