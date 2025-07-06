package irvine.oeis.a384;

import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A384079 a(n) = permanent of the n X n circulant matrix with (row 1) = (F(0), F(1), ..., F(n-1)), where F = A000045 (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A384079 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Matrix<Z> m = new DefaultMatrix<>(mN, mN, Z.ZERO);
    for (long r = 0; r < mN; ++r) {
      for (long c = 0; c < mN; ++c) {
        m.set(r, c, Functions.FIBONACCI.z((r + c) % mN));
      }
    }
    return new MatrixRing<>(mN, Integers.SINGLETON).permanent(m);
  }
}

