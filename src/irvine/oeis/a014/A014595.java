package irvine.oeis.a014;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A014595 Conjectured dimensions of spaces of weight systems of chord diagrams.
 * @author Sean A. Irvine
 */
public class A014595 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Sequence b = new A014605();
    b.next();
    Polynomial<Z> prod = RING.one();
    for (int m = 1; m <= mN; ++m) {
      prod = RING.multiply(prod, RING.series(RING.one(), RING.pow(RING.oneMinusXToTheN(m), b.next().intValueExact(), mN), mN), mN);
    }
    return prod.coeff(mN);
  }
}
