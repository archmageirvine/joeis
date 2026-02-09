package irvine.oeis.a098;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A098054 Let M={{0,1},{1,1}}, M0=MatrixPower[(M-IdentityMatrix[2]),2], Det[M0]; a[n_]:=M0.a[n-1]; a[0]:={{0,1},{1,1}}.
 * @author Sean A. Irvine
 */
public class A098054 extends Sequence2 {

  private static final Matrix<Z> M = new DefaultMatrix<>(new Z[][] {
    {Z.TWO, Z.NEG_ONE},
    {Z.NEG_ONE, Z.ONE},
  }, Z.ZERO);
  private static final MatrixRing<Z> RING = new MatrixRing<>(M.rows(), Integers.SINGLETON);
  private Matrix<Z> mM = new DefaultMatrix<>(new Z[][] {
    {Z.ZERO, Z.ONE},
    {Z.ONE, Z.ONE},
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
