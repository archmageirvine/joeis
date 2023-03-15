package irvine.oeis.a061;

import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061914 Let H_n = n-th Hilbert matrix; sequence gives 1 / ( det(H_n) * denominator(permanent(H_n)) ).
 * @author Sean A. Irvine
 */
public class A061914 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final MatrixField<Q> mat = new MatrixField<>(++mN, Rationals.SINGLETON);
    final DefaultMatrix<Q> h = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (int i = 0; i < mN; ++i) {
      for (int j = 0; j < mN; ++j) {
        h.set(i, j, new Q(1, i + j + 1));
      }
    }
    return mat.det(h).multiply(mat.permanent(h).den()).reciprocal().toZ();
  }
}
