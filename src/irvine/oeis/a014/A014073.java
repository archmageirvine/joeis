package irvine.oeis.a014;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014073.
 * @author Sean A. Irvine
 */
public class A014073 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = RING.multiply(RING.multiply(Polynomial.create(1, -3, 10, -7, 7, 4, 6, 4, 7, -7, 10, -3, 1),
    RING.onePlusXToTheN(4)),
    RING.onePlusXToTheN(1));
  private static final Polynomial<Z> DEN = RING.multiply(RING.multiply(RING.multiply(RING.multiply(RING.pow(RING.oneMinusXToTheN(1), 3),
    RING.oneMinusXToTheN(4)),
    RING.oneMinusXToTheN(5)),
    RING.oneMinusXToTheN(6)),
    RING.oneMinusXToTheN(7));

  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}
