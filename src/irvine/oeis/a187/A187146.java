package irvine.oeis.a187;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A187146 McKay-Thompson series of class 12B for the Monster group with a(0) = 5.
 * @author Sean A. Irvine
 */
public class A187146 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = RING.monomial(Z.ONE, 2);
  private static final Polynomial<Z> X3 = RING.monomial(Z.ONE, 3);
  private static final Polynomial<Z> X4 = RING.monomial(Z.ONE, 4);
  private static final Polynomial<Z> X6 = RING.monomial(Z.ONE, 6);
  private static final Polynomial<Z> X12 = RING.monomial(Z.ONE, 12);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.series(RING.pow(RING.eta(X2, mN), 14, mN),
      RING.multiply(RING.pow(RING.eta(RING.x(), mN), 5, mN),
        RING.multiply(RING.eta(X3, mN),
          RING.multiply(RING.pow(RING.eta(X4, mN), 5, mN),
            RING.multiply(RING.pow(RING.eta(X6, mN), 2, mN), RING.eta(X12, mN), mN),
            mN),
          mN),
        mN),
      mN).coeff(mN);
  }
}
