package irvine.oeis.a098;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A098082 Absolute values of elements of flattened successive matrices B(k), k&gt;=0, read by rows where B(k) = M^k*C where M=[[-1, 1, 0], [0, -1, 1], [1, 1, -1]] and C = [[0, 1, 1], [1, 1, 1], [1, 1, 2]].
 * @author Sean A. Irvine
 */
public class A098082 extends Sequence2 {

  private static final Matrix<Z> M = new DefaultMatrix<>(new Z[][] {
    {Z.NEG_ONE, Z.ONE, Z.ZERO},
    {Z.ZERO, Z.NEG_ONE, Z.ONE},
    {Z.ONE, Z.ONE, Z.NEG_ONE}
  }, Z.ZERO);
  private static final MatrixRing<Z> RING = new MatrixRing<>(M.rows(), Integers.SINGLETON);
  private Matrix<Z> mM = new DefaultMatrix<>(new Z[][] {
    {Z.ZERO, Z.ONE, Z.ONE},
    {Z.ONE, Z.ONE, Z.ONE},
    {Z.ONE, Z.ONE, Z.TWO}
  }, Z.ZERO);
  private int mR = 0;
  private int mC = -1;

  @Override
  public Z next() {
    if (++mC >= mM.cols()) {
      if (++mR >= mM.rows()) {
        mM = RING.multiply(M, mM);
        mR = 0;
      }
      mC = 0;
    }
    return mM.get(mR, mC).abs();
  }
}
