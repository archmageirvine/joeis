package irvine.oeis.a123;

import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A123744 Circulants of Fibonacci numbers (including F_0 = 0).
 * @author Sean A. Irvine
 */
public class A123744 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Matrix<Q> m = new DefaultMatrix<>(++mN, mN, Q.ZERO);
    for (long r = 0; r < mN; ++r) {
      for (long c = 0; c < mN; ++c) {
        m.set(r, c, new Q(Functions.FIBONACCI.z((r + c) % mN)));
      }
    }
    return new MatrixField<>(mN, Rationals.SINGLETON).det(m).toZ().abs();
  }
}

