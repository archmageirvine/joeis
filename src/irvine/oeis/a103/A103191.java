package irvine.oeis.a103;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A103191 A sequence of triples arising from a matrix calculation, in particular let m = floor(n/3), then (a(3*m), a(3*m+1), a(3*m+2)) = M^(m*(m+1)/n) * (0, 1, 1) where M is the matrix [[1,0,1], [1,1,0], [-1,1,0]].
 * @author Sean A. Irvine
 */
public class A103191 extends Sequence0 {

  private static final MatrixRing<Z> RING = new MatrixRing<>(3, Integers.SINGLETON);
  private static final Matrix<Z> M = new DefaultMatrix<>(new Z[][] {{Z.ONE, Z.ZERO, Z.ONE}, {Z.ONE, Z.ONE, Z.ZERO}, {Z.NEG_ONE, Z.ONE, Z.ZERO}}, Z.ZERO);
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
