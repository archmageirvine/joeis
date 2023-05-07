package irvine.oeis.a063;

import irvine.math.api.Matrix;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Euler;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a048.A048887;

/**
 * A063686 Triangular array: a(n,k) is the number of binary necklaces (no turning over) of length n whose longest run of 1's has length k. Table begins at n=0, k=0.
 * @author Sean A. Irvine
 */
public class A063686 extends A048887 {

  // After Andrew Howroyd

  private int mN = -1;
  private int mM = 0;
  private Matrix<Z> mT;

  private Matrix<Z> r(final int n) {
    final Matrix<Z> mat = new DefaultMatrix<>(n, n, Z.ZERO);
    for (long r = 0; r < mat.rows(); ++r) {
      for (long k = 0; k < mat.cols(); ++k) {
        mat.set(r, k, get(r + 1, k + 1));
      }
    }
    return mat;
  }

  private Z sum(final Matrix<Z> m, final long n, final int k) {
    return Integers.SINGLETON.sum(1, k, j -> m.get(n - j - 1, k).subtract(m.get(n - j - 1, k - 1L)).multiply(j));
  }

  private Matrix<Z> s(final Matrix<Z> m) {
    final Matrix<Z> mat = new DefaultMatrix<>(m.rows() - 1, m.cols() - 1, Z.ZERO);
    for (int n = 1; n <= mat.rows(); ++n) {
      for (int k = 1; k <= mat.cols(); ++k) {
        if (k < n - 1) {
          mat.set(n - 1, k - 1, m.get(n - k - 2, k).multiply(k + 1).add(sum(m, n, k)));
        } else if (k < n) {
          mat.set(n - 1, k - 1, Z.valueOf(n));
        }
      }
    }
    return mat;
  }

  private Matrix<Z> t(final int n) {
    final Matrix<Z> m = s(r(n + 1));
    final Matrix<Z> mat = new DefaultMatrix<>(n, n, Z.ZERO);
    for (int row = 1; row <= n; ++row) {
      final int r = row;
      for (int col = 1; col <= n; ++col) {
        final int c = col;
        final Z s = Integers.SINGLETON.sumdiv(r, d -> c < d ? m.get(d - 1, c - 1).multiply(Euler.phi((long) r / d)) : Z.ZERO).divide(r);
        mat.set(row - 1, col - 1, row == col ? s.add(1) : s);
      }
    }
    return mat;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mT = t(mN);
    }
    return mM == 0 ? Z.ONE : mT.get(mN - 1, mM - 1);
  }
}
