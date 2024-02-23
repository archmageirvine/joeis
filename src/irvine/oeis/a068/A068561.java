package irvine.oeis.a068;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068561 Numerators of coefficients in (1+x)^(1/3)-(1-x)^(1/3) power series.
 * @author Sean A. Irvine
 */
public class A068561 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    return select(RING.pow(RING.onePlusXToTheN(1), Q.ONE_THIRD, mN).coeff(mN - 1).subtract(RING.pow(RING.oneMinusXToTheN(1), Q.ONE_THIRD, mN).coeff(mN - 1)));
  }
}

