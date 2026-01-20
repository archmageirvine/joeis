package irvine.oeis.a390;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390669 allocated for Jeffrey Shallit.
 * @author Sean A. Irvine
 */
public class A390669 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final MatrixField<Q> ring = new MatrixField<>(++mN, Rationals.SINGLETON);
    Z min = Z.ZERO;
    for (long k = 0; k < 1L << (2 * mN - 1); ++k) {
      final Matrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
      for (int x = 0; 1L << x <= k; ++x) {
        if ((k & (1L << x)) != 0) {
          for (int y = 0, z; y < mN && (z = x - y) >= 0; ++y) {
            if (z < mN) {
              m.set(z, y, Q.ONE);
            }
          }
        }
      }
      min = min.min(ring.det(m).toZ());
    }
    return min;
  }
}
