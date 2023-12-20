package irvine.oeis.a067;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A067549 Determinant of n X n matrix whose diagonal are the first n primes and all other elements are 1's.
 * @author Sean A. Irvine
 */
public class A067549 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Sequence primes = new A000040();
    final Matrix<Q> m = new DefaultMatrix<>(++mN, mN, Q.ZERO);
    for (long y = 0; y < mN; ++y) {
      m.set(y, y, new Q(primes.next()));
      for (long x = y + 1; x < mN; ++x) {
        m.set(y, x, Q.ONE);
        m.set(x, y, Q.ONE);
      }
    }
    return new MatrixField<>(mN, Rationals.SINGLETON).det(m).toZ();
  }
}
