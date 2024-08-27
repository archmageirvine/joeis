package irvine.oeis.a071;

import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071999 Determinant of n X n matrix whose element A(i,j) is 1 if i=j, i if n=i+j and 0 otherwise.
 * @author Sean A. Irvine
 */
public class A071999 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final DefaultMatrix<Q> m = new DefaultMatrix<>(++mN, mN, Q.ZERO);
    for (long r = 0; r < mN; ++r) {
      for (long c = 0; c < mN; ++c) {
        if (r == c) {
          m.set(r, c, Q.ONE);
        } else if (r + c + 2 == mN) {
          m.set(r, c, Q.valueOf(r + 1));
        }
      }
    }
    return new MatrixField<>(mN, Rationals.SINGLETON).det(m).toZ();
  }
}
