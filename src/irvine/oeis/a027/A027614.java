package irvine.oeis.a027;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027614 Related to Clebsch-Gordan formulas.
 * @author Sean A. Irvine
 */
public class A027614 implements Sequence {

  private int mN = 1;

  private Z inverseP(final int row, final int col) {
    Z prod = Z.ONE;
    for (int k = 0; k <= col - row - 2; ++k) {
      prod = prod.multiply(2 * mN - 2 * row - k);
    }
    return prod;
  }

  @Override
  public Z next() {
    final MatrixField<Q> fld = new MatrixField<>(++mN, Rationals.SINGLETON);
    final Matrix<Q> a = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (int row = 0; row < mN; ++row) {
      a.set(row, row, Q.ONE);
      for (int col = row + 1; col < mN; ++col) {
        final Q e = new Q(Binomial.binomial(mN - row, col - row).square(), Binomial.binomial(2 * mN - row - col + 1, col - row));
        a.set(row, col, e);
      }
    }
    final Matrix<Q> c = fld.log(a, mN);
    final int j = mN - 1;
    return c.get(0, j).divide(a.get(0, j)).multiply(inverseP(0, j)).toZ();
  }
}
