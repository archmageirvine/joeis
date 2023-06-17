package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000527 Series-parallel numbers.
 * @author Sean A. Irvine
 */
public class A000527 extends AbstractSequence {

  /* Construct the sequence. */
  public A000527() {
    super(4);
  }

  // Expansion is in terms of A^(4) on p.143 of Riordan's book
  // Effective g.f. is 4(13+14S+3S^2)(1+S)/(1-S)^7 where S is g.f. for A000084

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> THIRTEEN = Polynomial.create(13);
  private static final Z Z14 = Z.valueOf(14);
  private final A000084 mS84 = new A000084();
  private Polynomial<Z> mS = RING.zero();
  private int mN = -1;

  @Override
  public Z next() {
    mS = RING.add(mS, RING.monomial(mS84.next(), ++mN + 1));
    final Polynomial<Z> den = RING.pow(RING.subtract(RING.one(), mS), 7, mN);
    final Polynomial<Z> num = RING.multiply(RING.add(RING.add(THIRTEEN, RING.multiply(mS, Z14)), RING.multiply(RING.pow(mS, 2, mN), Z.THREE)), RING.add(mS, RING.one()), mN);
    return RING.coeff(num, den, mN).multiply(4);
  }
}
