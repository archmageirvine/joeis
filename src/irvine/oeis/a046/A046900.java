package irvine.oeis.a046;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001813;

/**
 * A046900 Triangle inverse to that in A046899.
 * @author Sean A. Irvine
 */
public class A046900 extends A046899 {

  private long mN = -1;
  private long mM = 0;
  private final Sequence mDenom = new A001813();
  private Z mD = null;
  private final DefaultMatrix<Q> mMatrix = new DefaultMatrix<>(0, 0, Q.ZERO);
  private Matrix<Q> mInverse;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mD = mDenom.next();
      mMatrix.setRows(mN + 1);
      mMatrix.setCols(mN + 1);
      for (long k = 0; k <= mN; ++k) {
        mMatrix.set(mN, k, new Q(super.next()));
      }
      mInverse = new MatrixField<>(mN + 1, Rationals.SINGLETON).inverse(mMatrix);
    }
    return mInverse.get(mN, mM).multiply(mD).toZ();
  }
}
