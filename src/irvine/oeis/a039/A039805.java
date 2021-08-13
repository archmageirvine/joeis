package irvine.oeis.a039;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a008.A008284;

/**
 * A039805 Matrix cube of partition triangle A008284.
 * @author Sean A. Irvine
 */
public class A039805 extends A008284 {

  private long mN = -1;
  private long mM = 0;
  private final DefaultMatrix<Z> mMatrix = new DefaultMatrix<>(0, 0, Z.ZERO);
  private Matrix<Z> mMatrixPower = null;

  protected int exponent() {
    return 3;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mMatrix.setRows(mN + 1);
      mMatrix.setCols(mN + 1);
      for (long k = 0; k <= mN; ++k) {
        mMatrix.set(mN, k, super.next());
      }
      mMatrixPower = new MatrixRing<>(mN + 1, Integers.SINGLETON).pow(mMatrix, exponent());
    }
    return mMatrixPower.get(mN, mM);
  }
}
