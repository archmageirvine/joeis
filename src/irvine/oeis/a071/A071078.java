package irvine.oeis.a071;

import irvine.factor.prime.Puma;
import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071078 Determinant of the n X n matrix whose element (i,j) equals the |i-j|-th prime or if i=j, 1.
 * @author Sean A. Irvine
 */
public class A071078 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final MatrixField<Q> field = new MatrixField<>(mN, Rationals.SINGLETON);
    final Matrix<Q> mat = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (long k = 0; k < mN; ++k) {
      for (long j = 0; j <= k; ++j) {
        if (k == j) {
          mat.set(k, j, Q.ONE);
        } else {
          final Q p = new Q(Puma.prime(Math.abs(k - j)));
          mat.set(k, j, p);
          mat.set(j, k, p);
        }
      }
    }
    return field.det(mat).toZ();
  }
}

