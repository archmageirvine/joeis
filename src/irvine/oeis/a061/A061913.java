package irvine.oeis.a061;

import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061913 Numerators of the determinant of matrix (M(n) - H(n)), where H(n) is the n-th Hilbert matrix and M(n) is an n X n matrix with i,j-th entry i+j-1.
 * @author Sean A. Irvine
 */
public class A061913 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final MatrixField<Q> mat = new MatrixField<>(++mN, Rationals.SINGLETON);
    final DefaultMatrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (int i = 0; i < mN; ++i) {
      for (int j = 0; j < mN; ++j) {
        m.set(i, j, new Q(i + j + 1).subtract(new Q(1, i + j + 1)));
      }
    }
    return mat.det(m).num();
  }
}
