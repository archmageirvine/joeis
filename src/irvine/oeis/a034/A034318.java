package irvine.oeis.a034;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034318 McKay-Thompson series of class 13A for the Monster group with a(0) = -2.
 * @author Sean A. Irvine
 */
public class A034318 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C13 = RING.monomial(Z.ONE, 13);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> eta13 = RING.eta(C13, mN);
    return RING.pow(RING.series(eta, eta13, mN), 2, mN).coeff(mN)
      .add(RING.pow(RING.series(eta13, eta, mN), 2, mN).shift(2).coeff(mN).multiply(13));
  }
}

