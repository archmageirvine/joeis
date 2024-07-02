package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071058 Number of ways of pairing odd numbers in the range 1 to n with even numbers in the range n+1 to 2n such that each pair sums to a prime.
 * @author Sean A. Irvine
 */
public class A071058 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    final long m = (++mN + 1) / 2;
    final MatrixField<Q> field = new MatrixField<>(m, Rationals.SINGLETON);
    final Matrix<Q> mat = new DefaultMatrix<>(m, m, Q.ZERO);
    final long t = mN + 3 - (mN & 1);
    for (int k = 0; k < m; ++k) {
      for (int j = 0; j < m; ++j) {
        if (mPrime.isPrime((k + j) * 2L + t)) {
          mat.set(k, j, Q.ONE);
        }
      }
    }
    return field.permanent(mat).toZ();
  }
}
