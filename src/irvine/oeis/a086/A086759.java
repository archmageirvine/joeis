package irvine.oeis.a086;

import irvine.math.api.Matrix;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086759 Permanent of the Cayley addition table of Z_{n}. a(n) is the permanent of the n X n matrix M_(i,j) = ((i+j) mod n) where i and j range from 0 to n-1.
 * @author Sean A. Irvine
 */
public class A086759 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Matrix<Z> m = new DefaultMatrix<>(++mN, mN, Z.ZERO);
    for (long k = 0; k < mN; ++k) {
      for (long j = 0; j < mN; ++j) {
        m.set(k, j, Z.valueOf((k + j) % mN));
      }
    }
    return new MatrixField<>(mN, IntegerField.SINGLETON).permanent(m);
  }
}
