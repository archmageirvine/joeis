package irvine.oeis.a045;

import irvine.math.MemoryFunction1;
import irvine.math.api.Matrix;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045912 Triangle of coefficients of characteristic polynomial of negative Pascal matrix with (i,j)-th entry -C(i+j-2,i-1).
 * @author Sean A. Irvine
 */
public class A045912 extends MemoryFunction1<Polynomial<Z>> implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Polynomial<Z> compute(final int n) {
    final Matrix<Z> mat = new DefaultMatrix<>(n, n, Z.ZERO);
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        mat.set(i, j, Binomial.binomial(i + j, i).negate());
      }
    }
    return new MatrixRing<>(n, IntegerField.SINGLETON).characteristicPolynomial(mat);
  }

  protected Z t(final int n, final int k) {
    return n < 0 ? Z.ZERO : get(n).coeff(k);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}

