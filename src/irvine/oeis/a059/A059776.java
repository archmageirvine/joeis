package irvine.oeis.a059;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059776 Three-quadrant Ferrers graphs that partition n.
 * @author Sean A. Irvine
 */
public class A059776 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C1 = Polynomial.create(1, -1);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> t1 = RING.zero();
    for (int i, j = 0; (i = j * (j + 1) / 2) <= mN; ++j) {
      t1 = RING.signedAdd((j & 1) == 0, t1, RING.series(RING.oneMinusXToTheN(j + 1), C1, mN - i).shift(i));
    }
    Polynomial<Z> t3 = RING.one();
    for (int j = 1; j <= mN; ++j) {
      t3 = RING.multiply(t3, RING.pow(RING.oneMinusXToTheN(j), 3, mN), mN);
    }
    return RING.coeff(t1, t3, mN);
  }
}
