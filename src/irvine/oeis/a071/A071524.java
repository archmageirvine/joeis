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
 * A071524.
 * @author Sean A. Irvine
 */
public class A071524 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    final MatrixField<Q> fld = new MatrixField<>(++mN, Rationals.SINGLETON);
    final Matrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (long k = 1; k <= mN; ++k) {
      for (long j = 1; j <= k; ++j) {
        if (mPrime.isPrime(k * k + j * j)) {
          m.set(k - 1, j - 1, Q.ONE);
          m.set(j - 1, k - 1, Q.ONE);
        }
      }
    }
    return fld.det(m).toZ();
  }
}
