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
 * A069704 Let M_2n be the 2n X 2n matrix M_(i,j)=C(2i,j)-C(2j,i) where C(k,l) denotes the binomial coefficients; then a(n)=det(M_2n).
 * @author Sean A. Irvine
 */
public class A069704 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    final Matrix<Q> mat = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (long k = 1; k <= mN; ++k) {
      for (long j = 1; j <= mN; ++j) {
        mat.set(k - 1, j - 1, new Q(Binomial.binomial(2 * k, j).subtract(Binomial.binomial(2 * j, k))));
      }
    }
    return new MatrixField<>(mN, Rationals.SINGLETON).det(mat).toZ();
  }
}
