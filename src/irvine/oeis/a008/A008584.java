package irvine.oeis.a008;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008584.
 * @author Sean A. Irvine
 */
public class A008584 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> DEN = RING.multiply(RING.multiply(RING.multiply(RING.multiply(RING.multiply(
    RING.oneMinusXToTheN(2),
    RING.oneMinusXToTheN(5)),
    RING.oneMinusXToTheN(6)),
    RING.oneMinusXToTheN(8)),
    RING.oneMinusXToTheN(9)),
    RING.oneMinusXToTheN(12));
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(RING.one(), DEN, ++mN);
  }
}

