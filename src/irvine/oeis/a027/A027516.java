package irvine.oeis.a027;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.partitions.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a008.A008284;

/**
 * A027516 Square of the lower triangular normalized partition matrix.
 * @author Sean A. Irvine
 */
public class A027516 extends A008284 {

  private int mN = 0;
  private int mM = 0;
  protected Matrix<Q> mMatrix = null;
  protected Z mLcm = null;

  protected int power() {
    return 2;
  }

  protected void step() {
    final MatrixField<Q> field = new MatrixField<>(++mN, Rationals.SINGLETON);
    final Matrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j <= k; ++j) {
        m.set(k, j, new Q(get((long) k + 1, (long) j + 1), IntegerPartition.partitions(k + 1)));
      }
    }
    mMatrix = field.pow(m, power());
    mLcm = Z.ONE;
    for (int k = 0; k < mN; ++k) {
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
