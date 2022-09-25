package irvine.oeis.a039;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a008.A008275;

/**
 * A039815 Triangle read by rows: matrix cube of the Stirling-1 triangle A008275.
 * @author Sean A. Irvine
 */
public class A039815 extends A008275 {

  private long mN = -1;
  private long mM = 0;
  private final DefaultMatrix<Z> mMatrix = new DefaultMatrix<>(0, 0, Z.ZERO);
  private Matrix<Z> mCube = null;

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
      mCube = new MatrixRing<>(mN + 1, Integers.SINGLETON).pow(mMatrix, 3);
    }
    return mCube.get(mN, mM);
  }
}
