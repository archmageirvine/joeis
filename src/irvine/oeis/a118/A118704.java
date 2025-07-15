package irvine.oeis.a118;

import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A118704 a(n) = determinant of n X n circulant matrix whose first row is the first n distinct Fibonacci numbers A000045(2), A000045(3), ... A000045(n+1).
 * @author Sean A. Irvine
 */
public class A118704 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Matrix<Z> m = new DefaultMatrix<>(mN, mN, Z.ZERO);
    for (long r = 0; r < mN; ++r) {
      for (long c = 0; c < mN; ++c) {
        m.set(r, c, Functions.FIBONACCI.z(2 + (r + mN - c) % mN));
      }
    }
    return new MatrixField<>(mN, IntegerField.SINGLETON).det(m);
  }
}

