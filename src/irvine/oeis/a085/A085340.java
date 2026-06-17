package irvine.oeis.a085;

import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085340 a(n) is the value of determinant of the following special matrix: diagonal values equal to n-2; upper triangular entries equal to -1; lower triangular values are +1.
 * @author Sean A. Irvine
 */
public class A085340 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final DefaultMatrix<Z> m = new DefaultMatrix<>(++mN, mN, Z.ZERO);
    final Z z = Z.valueOf(mN - 2);
    for (long k = 0; k < mN; ++k) {
      for (long j = k + 1; j < mN; ++j) {
        m.set(k, j, Z.NEG_ONE);
        m.set(j, k, Z.ONE);
      }
      m.set(k, k, z);
    }
    return new MatrixField<Z>(mN, IntegerField.SINGLETON).det(m);
  }
}
