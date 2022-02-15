package irvine.oeis.a039;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a008.A008277;

/**
 * A039810 Matrix square of Stirling2 triangle A008277: 2-levels set partitions of [n] into k first-level subsets.
 * @author Sean A. Irvine
 */
public class A039810 extends A008277 {

  private long mN = -1;
  private long mM = 0;
  private final DefaultMatrix<Z> mMatrix = new DefaultMatrix<>(0, 0, Z.ZERO);
  private Matrix<Z> mSquare = null;

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
      mSquare = new MatrixRing<>(mN + 1, Integers.SINGLETON).pow(mMatrix, 2);
    }
    return mSquare.get(mN, mM);
  }
}
