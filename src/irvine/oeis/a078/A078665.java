package irvine.oeis.a078;

import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078665 Maximum absolute value of coefficients of characteristic polynomial of M_n, the n X n matrix m_(i,j) = i mod j.
 * @author Sean A. Irvine
 */
public class A078665 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final DefaultMatrix<Z> m = new DefaultMatrix<>(mN, mN, Z.ZERO);
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j < mN; ++j) {
        m.set(k, j, Z.valueOf((k + 1) % (j + 1)));
      }
    }
    final Polynomial<Z> poly = new MatrixField<>(mN, IntegerField.SINGLETON).characteristicPolynomial(m);
    Z max = Z.ZERO;
    for (final Z c : poly) {
      max = max.max(c.abs());
    }
    return max;
  }
}
