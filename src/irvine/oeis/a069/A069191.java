package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069191 Determinant of n X n matrix defined by m(i,j)=1 if i+j is a prime, m(i,j)=0 otherwise.
 * @author Sean A. Irvine
 */
public class A069191 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    final MatrixField<Q> ring = new MatrixField<>(++mN, Rationals.SINGLETON);
    final Matrix<Q> mat = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (int k = 0; k < mN; ++k) {
      for (int j = k; j < mN; ++j) {
        if (mPrime.isPrime(k + j + 2)) {
          mat.set(k, j, Q.ONE);
          mat.set(j, k, Q.ONE);
        }
      }
    }
    return ring.det(mat).toZ();
  }
}

