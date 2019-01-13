package irvine.oeis.a008;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008582.
 * @author Sean A. Irvine
 */
public class A008582 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> DEN = RING.multiply(RING.multiply(RING.multiply(RING.multiply(RING.multiply(RING.multiply(RING.multiply(
    RING.oneMinusXToTheN(1),
    RING.oneMinusXToTheN(4)),
    RING.oneMinusXToTheN(6)),
    RING.oneMinusXToTheN(7)),
    RING.oneMinusXToTheN(9)),
    RING.oneMinusXToTheN(10)),
    RING.oneMinusXToTheN(12)),
    RING.oneMinusXToTheN(15));
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(RING.one(), DEN, ++mN);
  }
}

