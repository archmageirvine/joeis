package irvine.oeis.a069;

import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.predicate.Predicates;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069831.
 * @author Sean A. Irvine
 */
public class A069838 extends Sequence1 {

  private int mN = 0;
  private final DefaultMatrix<Q> mM = new DefaultMatrix<>(0, 0, Q.ZERO);

  @Override
  public Z next() {
    while (true) {
      ++mN;
      // Grow the matrix
      mM.setRows(mN);
      mM.setCols(mN);
      final long n2 = (long) mN * mN;
      for (int k = 0; k < mN; ++k) {
        final Q squareFree = Predicates.SQUARE_FREE.is((k + 1L) * (k + 1L) + n2) ? Q.ONE : Q.ZERO;
        mM.set(k, mN - 1, squareFree);
        mM.set(mN - 1, k, squareFree);
      }
      if (new MatrixField<>(mN, Rationals.SINGLETON).det(mM).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

