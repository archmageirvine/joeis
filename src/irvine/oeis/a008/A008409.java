package irvine.oeis.a008;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008409 Theta series of 16-dimensional Barnes-Wall lattice.
 * @author Sean A. Irvine
 */
public class A008409 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = Polynomial.create(0, 0, 1);
  private static final Z Z32 = Z.valueOf(32);
  private static final Z Z4096 = Z.valueOf(4096);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> eta = RING.pow(RING.eta(RING.x(), mN), 8, mN);
    final Polynomial<Z> eta2 = RING.pow(RING.eta(X2, mN), 8, mN);
    final Polynomial<Z> num = RING.add(RING.add(RING.pow(eta, 6, mN),
      RING.multiply(RING.multiply(RING.pow(eta, 3, mN), RING.pow(eta2, 3, mN), mN), Z32).shift(1)),
      RING.multiply(RING.pow(eta2, 6, mN), Z4096).shift(2));
    final Polynomial<Z> den = RING.pow(RING.multiply(eta, eta2, mN), 2, mN);
    return RING.coeff(num, den, mN);
  }
}
