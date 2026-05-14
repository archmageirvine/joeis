package irvine.oeis.a394;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394646 allocated for Ahmad J. Masad.
 * @author Sean A. Irvine
 */
public class A394646 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private Matrix<Q> mY = null;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      final Matrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
      for (int k = 0; k < mN; ++k) {
        for (int j = 0; j < mN; ++j) {
          m.set(k, j, Q.TEN.pow(k + 2).add(1).pow(j).add(9).divide(10));
        }
      }
      final Matrix<Q> b = new DefaultMatrix<>(mN, 1, Q.ZERO);
      for (int k = 0; k < mN; ++k) {
        b.set(k, 0, Q.TEN.pow(k + 2).add(1).pow(mN).add(9).divide(10));
      }
      final MatrixField<Q> fld = new MatrixField<>(mN, Rationals.SINGLETON);
      mY = fld.multiply(fld.inverse(m), b);
    }
    return mY.get(mM, 0).toZ();
  }
}
