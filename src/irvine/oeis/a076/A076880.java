package irvine.oeis.a076;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076880 Determinant of the n X n matrix M_n(i,j) = C(i+j,i) (mod 3).
 * @author Sean A. Irvine
 */
public class A076880 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if ((++mN % 3) == 2) {
      return Z.ZERO;
    }
    final MatrixRing<Q> ring = new MatrixRing<>(mN, Rationals.SINGLETON);
    final Matrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (long k = 0; k < mN; ++k) {
      for (long j = 0; j < mN; ++j) {
        m.set(k, j, Q.valueOf(Binomial.binomial(k + j + 2, k + 1, 3)));
      }
    }
    return ring.det(m).toZ();
  }
}
