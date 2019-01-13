package irvine.oeis.a005;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005129.
 * @author Sean A. Irvine
 */
public class A005129 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> eta3 = eta.substitutePower(3, mN);
    final Polynomial<Z> a = RING.pow(RING.series(RING.pow(eta, 3, mN), eta3, mN), 3, mN);
    final Polynomial<Z> b = RING.pow(RING.series(RING.pow(eta3, 3, mN), eta, mN), 3, mN).shift(1);
    return a.coeff(mN).add(b.coeff(mN).multiply(9));
  }
}

