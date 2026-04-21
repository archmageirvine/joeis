package irvine.oeis.a395;

import irvine.math.api.Matrix;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395150 allocated for F. Chapoton.
 * @author Sean A. Irvine
 */
public class A395150 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;
  private Polynomial<Z> mCharPoly;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      final Matrix<Z> m = new DefaultMatrix<>(mN, mN, Z.ZERO);
      for (int k = 0; k < mN; ++k) {
        for (int j = 0; j < mN; ++j) {
          m.set(k, j, Binomial.binomial(k + j + 1, j).negate());
        }
      }
      mCharPoly = new MatrixField<>(mN, IntegerField.SINGLETON).characteristicPolynomial(m);
    }
    return mCharPoly.coeff(mM);
  }
}
