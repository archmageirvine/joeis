package irvine.oeis.a027;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027446 Triangle read by rows: square of the lower triangular mean matrix.
 * @author Sean A. Irvine
 */
public class A027446 implements Sequence {

  private long mN = 0;
  private long mM = 0;
  protected Matrix<Q> mMatrix = null;
  protected Z mLcm = null;

  protected int power() {
    return 2;
  }

  protected void step() {
    final MatrixField<Q> field = new MatrixField<>(++mN, Rationals.SINGLETON);
    final Matrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (long k = 0; k < mN; ++k) {
      final Q q = new Q(1, k + 1);
      for (long j = 0; j <= k; ++j) {
        m.set(k, j, q);
      }
    }
    mMatrix = field.pow(m, power());
    mLcm = Z.ONE;
    for (long k = 0; k < mN; ++k) {
      mLcm = mLcm.lcm(mMatrix.get(mN - 1, k).den());
    }
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      mM = 0;
      step();
    }
    return mMatrix.get(mN - 1, mM).multiply(mLcm).toZ();
  }
}
