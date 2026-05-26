package irvine.oeis.a084;

import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084999 Determinant of a certain n X n matrix whose elements are the integers 1 to n^2 (see Comments).
 * @author Sean A. Irvine
 */
public class A084999 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final DefaultMatrix<Z> m = new DefaultMatrix<>(++mN, mN, Z.ZERO);
    for (long k = 0; k < mN; ++k) {
      m.set(k, k, Z.valueOf(k + 1));
    }
    long r = mN + 1;
    for (long i = 1; i < mN; ++i) {
      for (long row = mN - 1, col = mN - i - 1; row >= i; --row, --col) {
        m.set(row, col, Z.valueOf(r++));
      }
      for (long row = 0, col = i; row < mN - i; ++row, ++col) {
        m.set(row, col, Z.valueOf(r++));
      }
    }
    return new MatrixField<>(mN, IntegerField.SINGLETON).det(m);
  }
}
