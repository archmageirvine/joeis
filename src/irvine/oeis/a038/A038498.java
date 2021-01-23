package irvine.oeis.a038;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a008.A008284;

/**
 * A038498 Matrix inverse of partition triangle A008284.
 * @author Sean A. Irvine
 */
public class A038498 extends A008284 {

  private final DefaultMatrix<Q> mA = new DefaultMatrix<>(0, 0, Q.ZERO);
  private Matrix<Q> mAInverse = null;
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      mA.setRows(++mN);
      mA.setCols(mN);
      for (int k = 0; k < mN; ++k) {
        mA.set(mN - 1, k, new Q(super.next()));
      }
      mAInverse = new MatrixField<>(mN, Rationals.SINGLETON).inverse(mA);
      mM = 0;
    }
    return mAInverse.get(mN - 1, mM).toZ();
  }
}
