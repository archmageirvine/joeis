package irvine.oeis.a039;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a008.A008284;

/**
 * A039806 Matrix 4th power of partition triangle A008284.
 * @author Sean A. Irvine
 */
public class A039806 extends A008284 {

  private long mN = -1;
  private long mM = 0;
  private final DefaultMatrix<Z> mMatrix = new DefaultMatrix<>(0, 0, Z.ZERO);
  private Matrix<Z> mM4 = null;

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
      mM4 = new MatrixRing<>(mN + 1, Integers.SINGLETON).pow(mMatrix, 4);
    }
    return mM4.get(mN, mM);
  }
}
