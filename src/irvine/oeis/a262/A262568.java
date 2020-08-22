package irvine.oeis.a262;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a178.A178666;

/**
 * A262568 a(n) = A002703(n) + 2.
 * @author Sean A. Irvine
 */
public class A262568 extends A178666 {

  // After R. J. Mathar

  private int kStart(final int n, final int m) {
    return (n * (n + 1) / 2 + m - 1) / m;
  }

  private int kEnd(final int n, final int m) {
    return (3 * n + 1) * (3 * n) / (6 * m);
  }

  private int mN = 2;

  @Override
  public Z next() {
    ++mN;
    final int s = 2 * mN - 1;
    final Polynomial<Z> row = a178666((s - 1) / 2);
    final int m = 2 * mN + 1;
    Z q = Z.ZERO;
    for (int k = kStart(mN, m); k <= kEnd(mN, m); ++k) {
      final int vi = m * k - (mN + 1) * mN / 2;
      if (vi >= 0 && vi <= row.degree()) {
        q = q.add(row.coeff(vi));
      }
    }
    return q;
  }
}
