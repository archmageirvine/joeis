package irvine.oeis.a384;

import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384079 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A384079 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Matrix<Z> m = new DefaultMatrix<>(++mN, mN, Z.ZERO);
    for (long r = 0; r < mN; ++r) {
      for (long c = 0; c < mN; ++c) {
        m.set(r, c, Functions.FIBONACCI.z((r + c) % mN));
      }
    }
    return new MatrixRing<>(mN, Integers.SINGLETON).permanent(m);
  }
}

