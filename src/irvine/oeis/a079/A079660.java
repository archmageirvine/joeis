package irvine.oeis.a079;

import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079660 Determinant of the n X n matrix m(i,j)=C(i+j,abs(i-j)).
 * @author Sean A. Irvine
 */
public class A079660 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final DefaultMatrix<Z> m = new DefaultMatrix<>(++mN, mN, Z.ZERO);
    for (long k = 0; k < mN; ++k) {
      for (long j = 0; j < mN; ++j) {
        m.set(k, j, Binomial.binomial(k + j + 2, Math.abs(k - j)));
      }
    }
    return new MatrixField<>(mN, IntegerField.SINGLETON).det(m);
  }
}

