package irvine.oeis.a069;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069743 Let M_n be the n X n matrix M_(i,j)=1/(3^i+3^j), then a(n) is the numerator of det(M_n).
 * @author Sean A. Irvine
 */
public class A069743 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final MatrixField<Q> ring = new MatrixField<>(++mN, Rationals.SINGLETON);
    final Matrix<Q> mat = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (int k = 0; k < mN; ++k) {
      final Z a = Z.THREE.pow(k + 1);
      for (int j = 0; j < mN; ++j) {
        mat.set(k, j, new Q(Z.ONE, a.add(Z.THREE.pow(j + 1))));
      }
    }
    return ring.det(mat).num();
  }
}
