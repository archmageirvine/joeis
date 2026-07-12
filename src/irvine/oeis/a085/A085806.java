package irvine.oeis.a085;

import irvine.math.api.Matrix;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085806 Permanent of the character table of the elementary abelian group (C_2)^n.
 * @author Sean A. Irvine
 */
public class A085806 extends Sequence1 {

  private Matrix<Z> mA = new MatrixRing<>(1, Integers.SINGLETON).one();

  @Override
  public Z next() {
    final long n = mA.rows();
    final Matrix<Z> m = new DefaultMatrix<>(2 * n, 2 * n, Z.ZERO);
    for (long k = 0; k < n; ++k) {
      for (long j = 0; j < n; ++j) {
        m.set(k, j, mA.get(k, j));
        m.set(k + n, j, mA.get(k, j));
        m.set(k, j + n, mA.get(k, j));
        m.set(k + n, j + n, mA.get(k, j).negate());
      }
    }
    mA = m;
    return new MatrixField<>(2 * n, IntegerField.SINGLETON).permanent(mA);
  }
}
