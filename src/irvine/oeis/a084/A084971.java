package irvine.oeis.a084;

import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a083.A083140;

/**
 * A084971 Determinant of the leading n X n submatrix of A083140.
 * @author Sean A. Irvine
 */
public class A084971 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final A083140 s = new A083140();
    final DefaultMatrix<Z> m = new DefaultMatrix<>(++mN, mN, Z.ZERO);
    for (int r = 0; r < mN; ++r) {
      for (int c = 0; c < mN; ++c) {
        m.set(r, c, s.t(r));
      }
    }
    return new MatrixField<>(mN, IntegerField.SINGLETON).det(m);
  }
}
