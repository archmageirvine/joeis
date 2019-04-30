package irvine.oeis.a080;

import irvine.math.group.IntegerField;
import irvine.math.group.MatrixRing;
import irvine.math.group.PolynomialRingField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.api.Matrix;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A080018 Triangle of coefficients of polynomials <code>P(n; x) =</code> Permanent(M), where M=[m(i,j)] is n X n matrix defined by <code>m(i,j)=x</code> if <code>-1&lt;=i-j&lt;=1</code> else <code>m(i,j)=1</code>.
 * @author Sean A. Irvine
 */
public class A080018 implements Sequence {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mP = null;
  private int mN = -1;
  private int mK = 0;

  protected Matrix<Polynomial<Z>> a(final int n) {
    final Matrix<Polynomial<Z>> m = new DefaultMatrix<>(n, n, RING.zero());
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        m.set(i, j, Math.abs(i - j) <= 1 ? RING.x() : RING.one());
      }
    }
    return m;
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      if (++mN == 0) {
        return Z.ONE;
      }
      final MatrixRing<Polynomial<Z>> ring = new MatrixRing<>(mN, RING);
      mP = ring.permanent(a(mN));
      mK = 0;
    }
    return mP.coeff(mK);
  }
}
