package irvine.oeis.a071;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071386.
 * @author Sean A. Irvine
 */
public class A071409 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final MatrixField<Q> fld = new MatrixField<>(++mN, Rationals.SINGLETON);
    final Matrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (long k = 1; k <= mN; ++k) {
      for (long j = 1; j <= mN; ++j) {
        m.set(k - 1, j - 1, new Q(Z.valueOf(k).pow(j).add(Z.valueOf(j).pow(k))));
      }
    }
    return fld.det(m).toZ();
  }
}
