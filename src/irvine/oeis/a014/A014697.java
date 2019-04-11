package irvine.oeis.a014;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014697 Poincar&#233; series [or Poincare series] (or Molien series) for <code>mod 2</code> cohomology of universal W-group W(4).
 * @author Sean A. Irvine
 */
public class A014697 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(1, 4, 20, 56, 84, 90, 84, 56, 20, 4, 1);
  private static final Polynomial<Z> DEN = RING.pow(RING.oneMinusXToTheN(2), 10);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}

