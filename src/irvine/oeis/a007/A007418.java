package irvine.oeis.a007;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007418 Numerators of expansion of exp x / sin x.
 * @author Sean A. Irvine
 */
public class A007418 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 1;

  protected Z select(final Q coeff) {
    return coeff.num();
  }

  @Override
  public Z next() {
    return select(RING.coeff(RING.exp(RING.x(), ++mN).shift(1), RING.sin(RING.x(), mN), mN - 1));
  }
}
