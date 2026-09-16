package irvine.oeis.a086;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086569 Product of the nonzero eigenvalues of the circulant matrix whose rows are formed by successively rotating a vector of binomial coefficients right. Generalization of A048954.
 * @author Sean A. Irvine
 */
public class A086569 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Matrix<Q> m = new DefaultMatrix<>(++mN, mN, Q.ZERO);
    for (int j = 0; j < mN; ++j) {
      final Q b = Q.valueOf(Binomial.binomial(mN, j));
      for (int k = 0; k < mN; ++k) {
        m.set(k, (k + j) % mN, b);
      }
    }
    // Vieta gives product of roots directly without factoring
    final Polynomial<Q> cp = new MatrixField<>(mN, Rationals.SINGLETON).characteristicPolynomial(m);
    int k = 0;
    while (cp.coeff(k).isZero()) {
      ++k;
    }
    return cp.coeff(k).divide(cp.leadingCoeff()).toZ().multiply(Z.NEG_ONE.pow(cp.degree()));
  }
}
