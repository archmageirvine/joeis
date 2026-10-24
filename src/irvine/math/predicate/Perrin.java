package irvine.math.predicate;

import irvine.math.api.Matrix;
import irvine.math.group.IntegersMod;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;

/**
 * Test if a number is a Perrin number (see A013998).
 * @author Georg Fischer
 */
public class Perrin extends AbstractPredicate {

  private static final Matrix<Z> MATRIX = new DefaultMatrix<>(new Z[][] {
    {Z.ZERO, Z.ONE, Z.ZERO},
    {Z.ZERO, Z.ZERO, Z.ONE},
    {Z.ONE, Z.ONE, Z.ZERO}
  }, Z.ZERO);

  @Override
  public boolean is(final Z n) {
    if (!n.isProbablePrime()) {
      final MatrixRing<Z> ring = new MatrixRing<>(3, new IntegersMod(n));
      return ring.trace(ring.pow(MATRIX, n)).isZero();
    }
    return false;
  }
}
