package irvine.oeis.a121;

import irvine.math.api.Matrix;
import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A121811 a(n) is the floor of the first component of M^n * (0, 1, 2, 3) where M is the matrix [[c, 1/2, 1/2, 1/2], [1/2, c, 1/2, 1/2], [1/2, 1/2, c, 1/2], [1/2, 1/2, 1/2, c]] and c=sqrt(3)/2.
 * @author Sean A. Irvine
 */
public class A121811 extends Sequence1 {

  private static final MatrixField<CR> RING = new MatrixField<>(4, ComputableReals.SINGLETON);
  private static final CR C = CR.THREE.sqrt().divide(2);
  private static final Matrix<CR> M = new DefaultMatrix<>(new CR[][] {
    {C, CR.HALF, CR.HALF, CR.HALF},
    {CR.HALF, C, CR.HALF, CR.HALF},
    {CR.HALF, CR.HALF, C, CR.HALF},
    {CR.HALF, CR.HALF, CR.HALF, C},
  }, CR.ZERO);
  private static final Matrix<CR> V = new DefaultMatrix<>(new CR[][] {{CR.ZERO}, {CR.ONE}, {CR.TWO}, {CR.THREE}}, CR.ZERO);
  private long mN = -1;

  @Override
  public Z next() {
    return RING.multiply(RING.pow(M, ++mN), V).get(0, 0).floor();
  }
}
