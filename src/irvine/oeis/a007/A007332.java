package irvine.oeis.a007;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007332 Expansion of 6-dimensional cusp form (eta(q) * eta(q^3))^6 in powers of q.
 * @author Sean A. Irvine
 */
public class A007332 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(0, 0, 0, 1);
  private int mN = -2;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.ZERO;
    }
    return RING.pow(RING.multiply(RING.eta(RING.x(), mN), RING.eta(C, mN), mN), 6, mN).coeff(mN);
  }
}
