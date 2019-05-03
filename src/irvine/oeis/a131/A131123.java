package irvine.oeis.a131;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A131123 McKay-Thompson series of class <code>8A</code> for the Monster group with <code>a(0) = 8</code>.
 * @author Sean A. Irvine
 */
public class A131123 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = RING.monomial(Z.ONE, 2);
  private static final Polynomial<Z> X4 = RING.monomial(Z.ONE, 4);
  private static final Polynomial<Z> X8 = RING.monomial(Z.ONE, 8);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.pow(RING.series(RING.multiply(RING.eta(X2, mN), RING.eta(X4, mN), mN),
      RING.multiply(RING.eta(RING.x(), mN), RING.eta(X8, mN), mN), mN), 8, mN).coeff(mN);
  }
}
