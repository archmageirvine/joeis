package irvine.oeis.a008;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008583 Molien series for Weyl group E_7.
 * @author Sean A. Irvine
 */
public class A008583 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> DEN = RING.multiply(RING.multiply(RING.multiply(RING.multiply(RING.multiply(RING.multiply(
    RING.oneMinusXToTheN(1),
    RING.oneMinusXToTheN(3)),
    RING.oneMinusXToTheN(4)),
    RING.oneMinusXToTheN(5)),
    RING.oneMinusXToTheN(6)),
    RING.oneMinusXToTheN(7)),
    RING.oneMinusXToTheN(9));
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(RING.one(), DEN, ++mN);
  }
}

