package irvine.oeis.a240;

import irvine.factor.prime.Fast;
import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.SmallDenseMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A240986 Determinants of <code>n X n</code> matrices of sets of distinct primes selected by increasing prime gaps (see comments).
 * @author Sean A. Irvine
 */
public class A240986 implements Sequence {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  private Matrix<Z> buildMatrix(final int n) {
    final Z[][] e = new Z[n][n];
    for (int k = 0; k < n; ++k) {
      final int step = 2 + 2 * k;
      long p = 3;
      for (int j = 0; j < n; p = mPrime.nextPrime(p)) {
        if (mPrime.isPrime(p + step)) {
          e[k][j++] = Z.valueOf(p);
        }
      }
    }
    return new SmallDenseMatrix<>(e, Z.ZERO);
  }

  @Override
  public Z next() {
    return new MatrixRing<>(++mN, Integers.SINGLETON).det(buildMatrix(mN));
  }
}

