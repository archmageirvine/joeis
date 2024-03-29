package irvine.oeis.a012;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012863 Numerators of coefficients in Taylor series expansion of  log(cotan(x)*log(x+1)).
 * @author Sean A. Irvine
 */
public class A012863 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return select(Q.ZERO);
    }
    return select(RING.log(RING.multiply(RING.xcot(RING.x(), mN + 1), RING.log1p(RING.x(), mN + 1), mN + 1).shift(-1), mN).coeff(mN));
  }
}
