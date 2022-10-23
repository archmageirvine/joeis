package irvine.oeis.a006;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006354 Expansion of a cusp form of weight 8 for Gamma_1(6).
 * @author Sean A. Irvine
 */
public class A006354 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> Z2 = RING.monomial(Z.ONE, 2);
  private static final Polynomial<Z> Z3 = RING.monomial(Z.ONE, 3);
  private static final Polynomial<Z> Z6 = RING.monomial(Z.ONE, 6);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> a = RING.multiply(RING.pow(RING.eta(RING.x(), mN), 4, mN), RING.pow(RING.eta(Z2, mN), 4, mN));
    final Polynomial<Z> b = RING.multiply(RING.multiply(RING.pow(RING.eta(Z3, mN), 4, mN), RING.pow(RING.eta(Z6, mN), 4, mN), mN), Z.NINE).shift(1);
    return RING.pow(RING.subtract(a, b), 2, mN).coeff(mN).abs();
  }
}

