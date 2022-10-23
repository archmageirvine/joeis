package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058371 The sequence S defined in A058540.
 * @author Sean A. Irvine
 */
public class A058371 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Polynomial<Q> mS = RING.zero();

  @Override
  public Z next() {
    if (++mN > 0) {
      final Polynomial<Q> c = RING.sum(1, mN, k -> RING.divide(RING.add(RING.monomial(Q.ONE, k), RING.multiply(mS.substitutePower(k, mN), Q.TWO)), new Q(k)));
      mS = RING.subtract(RING.subtract(RING.exp(c, mN), RING.onePlusXToTheN(1)), RING.multiply(mS, Q.TWO));
    }
    return mS.coeff(mN).toZ();
  }
}

