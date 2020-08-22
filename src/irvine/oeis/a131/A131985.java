package irvine.oeis.a131;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A131985 Expansion of (eta(q^3)^2 / (eta(q) * eta(q^9)))^6 in powers of q.
 * @author Sean A. Irvine
 */
public class A131985 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X3 = RING.monomial(Z.ONE, 3);
  private static final Polynomial<Z> X9 = RING.monomial(Z.ONE, 9);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.pow(RING.series(RING.pow(RING.eta(X3, mN), 2, mN),
      RING.multiply(RING.eta(RING.x(), mN), RING.eta(X9, mN), mN), mN), 6, mN).coeff(mN);
  }
}
