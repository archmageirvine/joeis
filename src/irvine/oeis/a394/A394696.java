package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394696
 */
public class A394696 extends Sequence1 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    final int n = mN;
    final int k = n * (n - 1) / 2;
    final int lim = 1 << k;

    long an = 0;

    for (int mask = 0; mask < lim; ++mask) {

      // Build m
      int[][] m = new int[n][n];
      int pos = 0;
      for (int i = 1; i < n; ++i) {
        for (int j = 0; j < i; ++j) {
          m[i][j] = (mask >>> pos) & 1;
          ++pos;
        }
      }

      // Make symmetric
      for (int i = 0; i < n; ++i) {
        for (int j = i + 1; j < n; ++j) {
          int val = m[i][j] + m[j][i];
          m[i][j] = val;
          m[j][i] = val;
        }
      }

      // di = row sums
      int[] di = new int[n];
      long pr = 1;
      for (int i = 0; i < n; ++i) {
        int sum = 0;
        for (int j = 0; j < n; ++j) {
          sum += m[i][j];
        }
        di[i] = sum;
        pr *= sum;
        if (pr == 0) {
          break;
        }
      }
      if (pr == 0) {
        continue;
      }

      // dij[j] = Sum_i di[i] * m[j][i]
      int[] dij = new int[n];
      for (int j = 0; j < n; ++j) {
        int sum = 0;
        for (int i = 0; i < n; ++i) {
          sum += di[i] * m[j][i];
        }
        dij[j] = sum;
      }

      // diff = dij/di - di
      int countPos = 0;
      for (int i = 0; i < n; ++i) {
        // safe since di[i] != 0
        if (dij[i] > (long) di[i] * di[i]) {
          ++countPos;
        }
      }

      if (countPos > n / 2) {
        ++an;
      }
    }

    return Z.valueOf(an);
  }
}
