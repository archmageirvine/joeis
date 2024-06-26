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
 * A071013.
 * @author Sean A. Irvine
 */
public class A071063 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final MatrixField<Q> field = new MatrixField<>(mN, Rationals.SINGLETON);
    final Matrix<Q> mat = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (long k = 0; k < mN; ++k) {
      for (long j = 0; j <= k; ++j) {
        if (!mPrime.isPrime(k + j + 2)) {
          mat.set(k, j, Q.ONE);
          mat.set(j, k, Q.ONE);
        }
      }
    }
    return field.det(mat).toZ();
  }
}
