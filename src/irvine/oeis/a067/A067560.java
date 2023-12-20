package irvine.oeis.a067;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a018.A018252;

/**
 * A067560 Determinant of n X n matrix whose rows are cyclic permutations of 1..n-th nonprime (A018252).
 * @author Sean A. Irvine
 */
public class A067560 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Sequence nonprimes = new A018252();
    final Matrix<Q> m = new DefaultMatrix<>(++mN, mN, Q.ZERO);
    for (long x = 0; x < mN; ++x) {
      final Q v = new Q(nonprimes.next());
      for (long y = 0; y < mN; ++y) {
        m.set(y, (x + mN - y) % mN, v);
      }
    }
    return new MatrixField<>(mN, Rationals.SINGLETON).det(m).toZ();
  }
}
