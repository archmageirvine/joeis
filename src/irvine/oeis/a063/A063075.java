package irvine.oeis.a063;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063075 Number of partitions of 2n^2 whose Ferrers-plot fits within a 2n X 2n box and cover an n X n box; number of ways to cut a 2n X 2n chessboard into two equal-area pieces along a non-descending line from lower left to upper right and passing through the center.
 * @author Sean A. Irvine
 */
public class A063075 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    final int n2 = ++mN * mN;
    Polynomial<Z> num = RING.one();
    Polynomial<Z> den = RING.one();
    for (int k = 1; k <= mN; ++k) {
      num = RING.multiply(num, RING.oneMinusXToTheN(mN + k), n2);
      den = RING.multiply(den, RING.oneMinusXToTheN(k), n2);
    }
    return RING.pow(RING.series(num, den, n2), 2, n2).coeff(n2);
  }
}
