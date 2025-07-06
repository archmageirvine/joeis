package irvine.oeis.a078;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078536 Infinite lower triangular matrix, M, that satisfies [M^4](i,j) = M(i+1,j+1) for all i,j&gt;=0 where [M^n](i,j) denotes the element at row i, column j, of the n-th power of matrix M, with M(0,k)=1 and M(k,k)=1 for all k&gt;=0.
 * @author Sean A. Irvine
 */
public class A078536 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private final DefaultMatrix<Z> mMat = new DefaultMatrix<>(new Z[][] {{Z.ONE}}, Z.ZERO);

  @Override
  public Z next() {
    if (++mM > mN) {
      if (++mN > 0) {
        final MatrixRing<Z> ring = new MatrixRing<>(mN, Integers.SINGLETON);
        final Matrix<Z> m = ring.pow(mMat, 4);
        mMat.setRows(mN + 1);
        mMat.setCols(mN + 1);
        mMat.set(mN, 0, Z.ONE);
        for (int k = 1; k <= mN; ++k) {
          mMat.set(mN, k, m.get(mN - 1, k - 1));
        }
      }
      mM = 0;
    }
    return mMat.get(mN, mM);
  }
}

