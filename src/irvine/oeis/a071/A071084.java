package irvine.oeis.a071;

import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071084 Determinant of the n X n matrix whose element (i,j) equals t(|i-j|) where t(n) is the number of divisors of n and t(0) = 0.
 * @author Sean A. Irvine
 */
public class A071084 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final MatrixField<Q> field = new MatrixField<>(mN, Rationals.SINGLETON);
    final Matrix<Q> mat = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (long k = 0; k < mN; ++k) {
      for (long j = 0; j < k; ++j) {
        final Q p = new Q(Functions.SIGMA0.l(Math.abs(k - j)));
        mat.set(k, j, p);
        mat.set(j, k, p);
      }
    }
    return field.det(mat).toZ();
  }
}

