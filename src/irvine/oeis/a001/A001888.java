package irvine.oeis.a001;

import irvine.math.matrix.DefaultMatrix;
import irvine.math.api.Matrix;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A001888.
 * @author Sean A. Irvine
 */
public class A001888 extends A001884 {

  @Override
  protected Matrix<Polynomial<Z>> a(final int n) {
    final Matrix<Polynomial<Z>> m = new DefaultMatrix<>(n, n, mRing.zero());
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        final int d = i - j;
        m.set(i, j, 0 <= d && d <= 2 ? mRing.x() : mRing.one());
      }
    }
    return m;
  }

}
