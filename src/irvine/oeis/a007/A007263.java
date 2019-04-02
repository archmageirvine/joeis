package irvine.oeis.a007;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007263 McKay-Thompson series of class 6d for Monster.
 * @author Sean A. Irvine
 */
public class A007263 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = RING.monomial(Z.ONE, 2);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Polynomial<Z> a7259 = RING.pow(RING.series(RING.eta(RING.x(), mN), RING.eta(X2, mN), mN), 8, mN);
    final Polynomial<Z> q = a7259.substitutePower(3, mN);
    return q.coeff(mN).add(RING.coeff(RING.x(), q, mN - 1).multiply(16));
  }
}
