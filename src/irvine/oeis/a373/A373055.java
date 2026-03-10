package irvine.oeis.a373;

import irvine.math.api.Matrix;
import irvine.math.group.IntegersMod;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A373055 Numbers k that divide the k-th term of the tribonacci sequence A000213.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A373055 extends Sequence1 {

  private static final Matrix<Z> MATRIX = new DefaultMatrix<>(new Z[][]{{Z.ONE, Z.ONE, Z.ONE}, {Z.ONE, Z.ZERO, Z.ZERO}, {Z.ZERO, Z.ONE, Z.ZERO}}, Z.ZERO);
  private static final Matrix<Z> C = new DefaultMatrix<>(new Z[][]{{Z.ONE}, {Z.ONE}, {Z.ONE}}, Z.ZERO);
  private long mN = 0;

  private boolean is(final long n) {
    final IntegersMod r = new IntegersMod(n);
    final MatrixRing<Z> ring = new MatrixRing<>(3, r);
    final Matrix<Z> res = ring.multiply(ring.pow(MATRIX, n), C);
    return res.get(2, 0).isZero();
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
