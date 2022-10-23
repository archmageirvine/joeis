package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A000432 Series-parallel numbers.
 * @author Sean A. Irvine
 */
public class A000432 extends Sequence3 {

  // Expansion is in terms of A^(3) on p.143 of Riordan's book
  // Effective g.f. is 4(2+S)(1+S)/(1-S)^5 where S is g.f. for A000084

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> TWO = Polynomial.create(2);
  private final A000084 mS84 = new A000084();
  private Polynomial<Z> mS = RING.zero();
  private int mN = -1;

  @Override
  public Z next() {
    mS = RING.add(mS, RING.monomial(mS84.next(), ++mN + 1));
    final Polynomial<Z> num = RING.multiply(RING.add(mS, RING.one()), RING.add(TWO, mS));
    final Polynomial<Z> den = RING.pow(RING.subtract(RING.one(), mS), 5, mN);
    return RING.coeff(num, den, mN).multiply(4);
  }
}
