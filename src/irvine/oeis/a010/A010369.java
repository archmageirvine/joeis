package irvine.oeis.a010;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010369 Number of points of L1 norm 2n in root system version of E_8 lattice.
 * @author Sean A. Irvine
 */
public class A010369 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(1, 0, 120, 0, 1948, 1024, 11592, 7168, 21830, 7168, 11592, 1024, 1948, 0, 120, 0, 1).substitutePower(2);
  private static final Polynomial<Z> DEN = RING.multiply(RING.pow(RING.oneMinusXToTheN(2), 8), RING.pow(RING.onePlusXToTheN(2), 8));
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    return RING.coeff(NUM, DEN, mN);
  }
}
