package irvine.oeis.a035;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A035596 Number of points of L1 norm 2n in Barnes-Wall lattice BW_16.
 * @author Sean A. Irvine
 */
public class A035596 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM1 = RING.add(RING.add(RING.pow(RING.onePlusXToTheN(2), 16),
    RING.multiply(RING.pow(RING.onePlusXToTheN(2), 8), Z.valueOf(7680)).shift(8)),
    RING.monomial(Z.ONE.shiftLeft(16), 16));
  private static final Polynomial<Z> DEN1 = RING.pow(RING.oneMinusXToTheN(2), 16);
  private static final Polynomial<Z> DEN2 = RING.pow(RING.onePlusXToTheN(2), 16);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.coeff(NUM1, DEN1, mN).add(RING.coeff(DEN1, DEN2, mN)).divide2();
  }
}

