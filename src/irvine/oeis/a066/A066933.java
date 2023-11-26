package irvine.oeis.a066;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000040;

/**
 * A066933 Determinant of n X n matrix whose rows are cyclic permutations of 2..prime(n).
 * @author Sean A. Irvine
 */
public class A066933 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final MatrixField<Q> fld = new MatrixField<>(++mN, Rationals.SINGLETON);
    final Sequence primes = new A000040();
    final Matrix<Q> mat = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (int k = 0; k < mN; ++k) {
      final Q p = new Q(primes.next());
      for (int j = 0; j < mN; ++j) {
        mat.set(j, (k + mN - j) % mN, p);
      }
    }
    return fld.det(mat).toZ();
  }
}
