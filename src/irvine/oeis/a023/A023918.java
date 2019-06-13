package irvine.oeis.a023;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023918 Theta series of <code>A*_6</code> lattice.
 * @author Sean A. Irvine
 */
public class A023918 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X7 = RING.monomial(Z.ONE, 7);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> eta7 = RING.eta(X7, mN);
    final Z a = RING.coeff(RING.multiply(RING.pow(eta7, 7, mN).shift(2), Z.SEVEN), eta, mN);
    final Z b = RING.coeff(RING.pow(eta, 7, mN), eta7, mN);
    final Z c = RING.multiply(RING.pow(eta, 3, mN), RING.pow(eta7, 3, mN), mN).shift(1).coeff(mN).multiply(7);
    return a.add(b).add(c);
  }
}
