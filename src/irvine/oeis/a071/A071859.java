package irvine.oeis.a071;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a030.A030300;

/**
 * A071859 Determinant of M_n where M_n is the n X n matrix m_(i,j) = A030300(i+j).
 * @author Sean A. Irvine
 */
public class A071859 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(1, new A030300());
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Matrix<Q> mat = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (int r = 0; r < mN; ++r) {
      for (int c = 0; c < mN; ++c) {
        mat.set(r, c, Q.valueOf(mA.a(r + c + 2)));
      }
    }
    return new MatrixField<Q>(mN, Rationals.SINGLETON).det(mat).toZ();
  }
}
