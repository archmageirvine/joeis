package irvine.oeis.a098;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A098017 M={{0, 1, -1, 1}, {-1, 0, 1, -1}, {1, -1, 0, 1}, {-1, 1, -1, 0}}; a(n) =M*a(n-1); a(0):={{0, 1, 1, 2}, {1, 1, 2, 3}, {1, 2, 3, 5}, {2, 3, 5, 8}}.
 * @author Sean A. Irvine
 */
public class A098017 extends Sequence2 {

  private static final Matrix<Z> C = new DefaultMatrix<>(new Z[][] {
    {Z.ZERO, Z.ONE, Z.ONE, Z.TWO},
    {Z.ONE, Z.ONE, Z.TWO, Z.THREE},
    {Z.ONE, Z.TWO, Z.THREE, Z.FIVE},
    {Z.TWO, Z.THREE, Z.FIVE, Z.EIGHT}
  }, Z.ZERO);
  private static final Matrix<Z> M = new DefaultMatrix<>(new Z[][] {
    {Z.ZERO, Z.ONE, Z.NEG_ONE, Z.ONE},
    {Z.NEG_ONE, Z.ZERO, Z.ONE, Z.NEG_ONE},
    {Z.ONE, Z.NEG_ONE, Z.ZERO, Z.ONE},
    {Z.NEG_ONE, Z.ONE, Z.NEG_ONE, Z.ZERO}
  }, Z.ZERO);
  private static final MatrixRing<Z> RING = new MatrixRing<>(M.rows(), Integers.SINGLETON);
  private Matrix<Z> mM = RING.multiply(M, C);
  private long mR = mM.rows();
  private long mC = mM.cols();

  @Override
  public Z next() {
    if (++mC >= mM.rows()) {
      if (++mR >= mM.cols()) {
        mM = RING.multiply(M, mM);
        mR = 0;
      }
      mC = 0;
    }
    return mM.get(mR, mC).abs();
  }
}
