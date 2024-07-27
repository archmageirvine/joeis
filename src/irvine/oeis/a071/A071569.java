package irvine.oeis.a071;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071569 Det(M_n) where M_n is the n X n matrix m(i,j)=1 if floor(i/j) is even, 0 otherwise.
 * @author Sean A. Irvine
 */
public class A071569 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final MatrixField<Q> fld = new MatrixField<>(++mN, Rationals.SINGLETON);
    final Matrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j < mN; ++j) {
        final int f = (k + 1) / (j + 1);
        if ((f & 1) == 0) {
          m.set(k, j, Q.ONE);
        }
      }
    }
    return fld.det(m).toZ();
  }
}

