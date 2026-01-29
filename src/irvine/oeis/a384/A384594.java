package irvine.oeis.a384;

import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A384594 a(n) = permanent of the n X n circulant matrix with (row 1) = (F(2), F(3), ..., F(n+1)), where F = A000045 (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A384594 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Matrix<Z> m = new DefaultMatrix<>(++mN, mN, Z.ZERO);
    for (long r = 0; r < mN; ++r) {
      for (long c = 0; c < mN; ++c) {
        m.set(r, c, Functions.FIBONACCI.z(2 + (r + c) % mN));
      }
    }
    return new MatrixRing<>(mN, Integers.SINGLETON).permanent(m);
  }
}

