package irvine.oeis.a002;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002578.
 * @author Sean A. Irvine
 */
public class A002578 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(1, 1, 1, 0, 1, 1).shift(3);
  private static final Polynomial<Z> DEN = RING.multiply(RING.pow(Polynomial.create(1, -1), 2), RING.oneMinusXToTheN(6));
  private int mN = 0;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}

