package irvine.oeis.a069;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069945 Let M_k be the k X k matrix M_k(i,j)=1/binomial(i+n,j); then a(n)=1/det(M_(n+1)).
 * @author Sean A. Irvine
 */
public class A069945 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final MatrixField<Q> fld = new MatrixField<>(++mN, Rationals.SINGLETON);
    final Matrix<Q> mat = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j < mN; ++j) {
        mat.set(k, j, new Q(Z.ONE, Binomial.binomial(k + mN, j + 1)));
      }
    }
    return fld.det(mat).reciprocal().toZ();
  }
}
