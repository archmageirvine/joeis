package irvine.oeis.a085;

import irvine.math.api.Matrix;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085807 Permanent of the symmetric n X n matrix A defined by A[i,j] = |i-j| for 1 &lt;= i,j &lt;= n.
 * @author Sean A. Irvine
 */
public class A085807 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Matrix<Z> m = new DefaultMatrix<>(mN, mN, Z.ZERO);
    for (long k = 0; k < mN; ++k) {
      for (long j = 0; j < mN; ++j) {
        m.set(k, j, Z.valueOf(Math.abs(k - j)));
      }
    }
    return new MatrixField<>(mN, IntegerField.SINGLETON).permanent(m);
  }
}
