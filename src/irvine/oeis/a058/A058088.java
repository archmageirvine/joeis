package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058088 McKay-Thompson series of class 8b for Monster.
 * @author Sean A. Irvine
 */
public class A058088 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = RING.monomial(Z.ONE, 2);
  private static final Polynomial<Z> X4 = RING.monomial(Z.ONE, 4);
  private static final Polynomial<Z> X8 = RING.monomial(Z.ONE, 8);
  private static final Polynomial<Z> Q4 = RING.multiply(RING.x(), Z.FOUR);
  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> f = RING.series(RING.multiply(RING.eta(X2, mN), RING.eta(X4, mN), mN),
      RING.multiply(RING.eta(RING.x(), mN), RING.eta(X8, mN), mN), mN);
    final Polynomial<Z> f4 = RING.pow(f, 4, mN);
    return f4.coeff(mN).add(RING.coeff(Q4, f4, mN));
  }
}
