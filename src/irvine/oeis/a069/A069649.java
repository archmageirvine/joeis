package irvine.oeis.a069;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069649 Let M_n be the n X n matrix with M_n(i,j)=i^3/(i+j); then a(n)=1/det(M_n).
 * @author Sean A. Irvine
 */
public class A069649 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final MatrixRing<Q> ring = new MatrixRing<>(++mN, Rationals.SINGLETON);
    final Matrix<Q> mat = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (int k = 0; k < mN; ++k) {
      final Z k3 = Z.valueOf(k + 1).pow(3);
      for (int j = 0; j < mN; ++j) {
        mat.set(k, j, new Q(k3, k + j + 2));
      }
    }
    return ring.det(mat).reciprocal().toZ();
  }
}
