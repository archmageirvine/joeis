package irvine.oeis.a121;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A121596 Expansion of q^(-1/2)(eta(q^3)/eta(q))^6 in powers of q.
 * @author Sean A. Irvine
 */
public class A121596 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X3 = RING.monomial(Z.ONE, 3);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.pow(RING.series(RING.eta(X3, mN), RING.eta(RING.x(), mN), mN), 6, mN).coeff(mN);
  }
}
