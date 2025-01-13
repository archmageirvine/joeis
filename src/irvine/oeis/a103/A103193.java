package irvine.oeis.a103;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A103193 This sequence needs a meaningful name.
 * @author Sean A. Irvine
 */
public class A103193 extends Sequence0 {

  private static final MatrixRing<Z> RING = new MatrixRing<>(3, Integers.SINGLETON);
  private static final Matrix<Z> M = new DefaultMatrix<>(new Z[][] {{Z.TWO, Z.ZERO, Z.ONE}, {Z.ZERO, Z.ONE, Z.ZERO}, {Z.valueOf(-2), Z.ONE, Z.ZERO}}, Z.ZERO);
  private static final Matrix<Z> V = new DefaultMatrix<>(new Z[][] {{Z.ZERO}, {Z.ONE}, {Z.ONE}}, Z.ZERO);
  private long mN = -1;
  private int mM = 2;

  @Override
  public Z next() {
    if (++mM == 3) {
      ++mN;
      mM = 0;
    }
    return RING.multiply(RING.pow(M, mN * (mN + 1) / 2), V).get(mM, 0);
  }
}
