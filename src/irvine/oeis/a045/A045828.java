package irvine.oeis.a045;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045828.
 * @author Sean A. Irvine
 */
public class A045828 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = RING.monomial(Z.ONE, 2);
  private static final Polynomial<Z> X4 = RING.monomial(Z.ONE, 4);

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.coeff(RING.multiply(RING.pow(RING.eta(X2, mN), 3, mN), RING.pow(RING.eta(X4, mN), 2, mN), mN), RING.pow(RING.eta(RING.x(), mN), 2, mN), mN);
  }
}
