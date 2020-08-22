package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.q.Q;

/**
 * A002206 Numerators of logarithmic numbers (also of Gregory coefficients G(n)).
 * @author Sean A. Irvine
 */
public class A002206 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return RING.coeff(RING.x(), RING.log1p(RING.x(), mN + 1), mN).num();
  }
}
