package irvine.oeis.a171;

import irvine.math.api.Matrix;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.a060.A060187;

/**
 * A171273 Matrix inverse of A060187.
 * @author Sean A. Irvine
 */
public class A171273 extends A060187 {

  private int mN = 0;
  private int mM = 0;
  private final DefaultMatrix<Z> mMatrix = new DefaultMatrix<>(0, 0, Z.ZERO);
  private Matrix<Z> mInverse = null;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mMatrix.setRows(mN);
      mMatrix.setCols(mN);
      for (int k = 0; k < mN; ++k) {
        mMatrix.set(mN - 1, k, super.next());
      }
      mInverse = new MatrixField<>(mN, IntegerField.SINGLETON).inverse(mMatrix);
      mM = 0;
    }
    return mInverse.get(mN - 1, mM);
  }
}
