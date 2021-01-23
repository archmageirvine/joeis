package irvine.oeis.a080;

import irvine.math.matrix.DefaultMatrix;
import irvine.math.api.Matrix;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A080061 Triangle of coefficients of polynomials P(n; x) = Permanent(M), where M=[m(i,j)] is n X n matrix defined by m(i,j)=x if 0&lt;=i-j&lt;=2 else m(i,j)=1.
 * @author Sean A. Irvine
 */
public class A080061 extends A080018 {

  @Override
  protected Matrix<Polynomial<Z>> a(final int n) {
    final Matrix<Polynomial<Z>> m = new DefaultMatrix<>(n, n, RING.zero());
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        final int d = i - j;
        m.set(i, j, 0 <= d && d <= 2 ? RING.x() : RING.one());
      }
    }
    return m;
  }
}
