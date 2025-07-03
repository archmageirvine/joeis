package irvine.oeis.a384;

import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A384591 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A384591 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Matrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (long r = 0; r < mN; ++r) {
      for (long c = 0; c < mN; ++c) {
        m.set(r, c, new Q(Functions.FIBONACCI.z(1 + (r + c) % mN)));
      }
    }
    return new MatrixField<>(mN, Rationals.SINGLETON).permanent(m).toZ();
  }
}

