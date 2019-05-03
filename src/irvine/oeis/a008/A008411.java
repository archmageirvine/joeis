package irvine.oeis.a008;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008411 Theta series of direct sum of 3 copies of <code>E_8</code> lattice (the Niemeier lattice of type <code>E_8^3)</code>.
 * @author Sean A. Irvine
 */
public class A008411 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = Polynomial.create(0, 0, 1);
  private static final Z Z256 = Z.valueOf(256);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> eta2 = RING.eta(X2, mN);
    final Polynomial<Z> num = RING.pow(RING.add(RING.pow(eta, 24, mN), RING.multiply(RING.pow(eta2, 24, mN), Z256).shift(1)), 3, mN);
    final Polynomial<Z> den = RING.pow(RING.multiply(eta, eta2, mN), 24, mN);
    return RING.coeff(num, den, mN);
  }
}
