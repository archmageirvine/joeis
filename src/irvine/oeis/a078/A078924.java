package irvine.oeis.a078;

import irvine.math.api.Matrix;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078924 Array of coefficients of characteristic polynomials of M_n, the n X n matrix with entries m_(i,j) = i mod j.
 * @author Sean A. Irvine
 */
public class A078924 extends Sequence0 {

  private Polynomial<Z> mCharPoly = Polynomial.create(1);
  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      final Matrix<Z> m = new DefaultMatrix<>(mN, mN, Z.ZERO);
      for (int k = 1; k <= mN; ++k) {
        for (int j = 1; j <= mN; ++j) {
          m.set(k - 1, j - 1, Z.valueOf(k % j));
        }
      }
      mCharPoly = new MatrixField<>(mN, IntegerField.SINGLETON).characteristicPolynomial(m);
    }
    return mCharPoly.get(mN - mM).multiply(Z.NEG_ONE.pow(mN));
  }
}
