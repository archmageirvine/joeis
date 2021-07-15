package irvine.oeis.a048;

import irvine.math.api.Matrix;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048954 Wendt determinant of n-th circulant matrix C(n).
 * @author Sean A. Irvine
 */
public class A048954 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN % 6 == 0) {
      return Z.ZERO;
    }
    final MatrixField<Z> ring = new MatrixField<>(mN, IntegerField.SINGLETON);
    final Matrix<Z> m = new DefaultMatrix<>(mN, mN, Z.ZERO);
    for (int r = 0; r < mN; ++r) {
      for (int c = 0; c < mN; ++c) {
        m.set(r, c, Binomial.binomial(mN, (c + mN - r) % mN));
      }
    }
    return ring.det(m);
  }
}

