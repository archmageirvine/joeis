package irvine.oeis.a390;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390903 a(n) is the permanent of the n X n matrix M(n) whose generic entry M(i, j, n) is 2*n - (i + j) with 1 &lt;= i,j &lt;= n.
 * @author Sean A. Irvine
 */
public class A390903 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Matrix<Q> m = new DefaultMatrix<>(++mN, mN, Q.ZERO);
    for (long k = 0; k < mN; ++k) {
      for (long j = 0; j < mN; ++j) {
        m.set(k, j, Q.valueOf(2 * mN - k - j - 2));
      }
    }
    return new MatrixField<>(mN, Rationals.SINGLETON).permanent(m).toZ();
  }
}

