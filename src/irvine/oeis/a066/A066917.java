package irvine.oeis.a066;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;

/**
 * A066838.
 * @author Sean A. Irvine
 */
public class A066917 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final MatrixField<Q> fld = new MatrixField<>(++mN, Rationals.SINGLETON);
    final Sequence composite = new A002808();
    final Matrix<Q> mat = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (int k = 0; k < mN; ++k) {
      final Q c = new Q(composite.next());
      for (int j = 0; j < mN; ++j) {
        mat.set(j, (k + mN - j) % mN, c);
      }
    }
    return fld.det(mat).toZ();
  }
}
