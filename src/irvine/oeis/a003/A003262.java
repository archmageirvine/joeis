package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.Arrays;

/**
 * A003262.
 * @author Sean A. Irvine
 */
public class A003262 implements Sequence {

  // After Tom Wilde

  private int mN = 0;
  private Q[][] mP = new Q[0][];

  private void computeP(final int n) {
    final Q[][] q = new Q[n][n + 1];
    for (final Q[] a : q) {
      Arrays.fill(a, Q.ZERO);
    }
    for (int m = 1; m < n; ++m) {
      for (int d = 1; d <= m; ++d) {
        if (m % d == 0) {
          final int l = m / d + 1;
          for (int i = 0; i <= l && d * i <= n; ++i) {
            q[m][i * d] = q[m][i * d].add(new Q(1, d));
          }
        }
      }
    }

    mP = new Q[n][n + 1];
    for (int k = 0; k < n; ++k) {
      Arrays.fill(mP[k], k == 0 ? Q.ONE : Q.ZERO);
    }
    for (int k = 1; k < n; ++k) {
      for (int s = 0; s <= k; ++s) {
        for (int j = 0; j <= n; ++j) {
          for (int i = 0; i <= j; ++i) {
            mP[k][j] = mP[k][j].add(q[s][j - i].multiply(s).multiply(mP[k - s][i]).divide(k));
          }
        }
      }
    }
  }

  private Z p(final int n, final int m) {
    if (n >= mP.length || m >= mP[n].length) {
      computeP(2 * n + 1); // Double number of entries to avoid recalculating too often
    }
    return mP[n][m].toZ();
  }

  @Override
  public Z next() {
    ++mN;
    return p(mN - 1, mN);
  }

}

