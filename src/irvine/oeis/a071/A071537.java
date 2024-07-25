package irvine.oeis.a071;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071531.
 * @author Sean A. Irvine
 */
public class A071537 extends Sequence1 {

  // After Max Alekseyev

  private final Fast mPrime = new Fast();
  private int mN = 0;

  private long matrank(final Matrix<Q> m) {
    return new MatrixField<>(m.rows(), Rationals.SINGLETON).rank(m);
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long m = mN;
    while (true) {
      if (mPrime.isPrime(++m)) {
        continue;
      }
      final int d = Functions.PRIME_PI.i(m);
      final Matrix<Q> mat = new DefaultMatrix<>(d, m - mN + 1, Q.ZERO);
      for (int k = 0; k <= m - mN; ++k) {
        final FactorSequence fs = Jaguar.factor(mN + k);
        for (final Z p : fs.toZArray()) {
          mat.set(Functions.PRIME_PI.l(p) - 1, k, new Q(fs.getExponent(p)));
        }
      }
      final Matrix<Q> mat2 = new DefaultMatrix<>(d, m - mN, Q.ZERO);
      for (long k = 0; k < mat2.rows(); ++k) {
        for (long j = 0; j < mat2.cols(); ++j) {
          mat2.set(k, j, mat.get(k, j + 1));
        }
      }
      //System.out.println(matrank(mat) + " " + matrank(mat2));
      if (matrank(mat) == matrank(mat2)) {
        return Z.valueOf(m);
      }
    }
  }
}
