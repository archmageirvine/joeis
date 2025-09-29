package irvine.oeis.a080;

import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080692 a(n)=(-1)^(n+1)*det(M(n)) where M(n) is the n X n matrix M(i,j)=min(abs(i-j),i).
 * @author Sean A. Irvine
 */
public class A080692 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final MatrixField<Q> fld = new MatrixField<>(++mN, Rationals.SINGLETON);
    final DefaultMatrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j < mN; ++j) {
        m.set(k, j, Q.valueOf(Math.min(Math.abs(k - j), k + 1)));
      }
    }
    return fld.det(m).toZ().abs();
  }
}
