package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058575 The sequence S defined in A058562.
 * @author Sean A. Irvine
 */
public class A058575 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C1 = RING.onePlusXToTheN(1);
  private int mN = -1;
  private Z mF = Z.ONE;
  private Polynomial<Q> mS = RING.zero();

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
      mS = RING.subtract(RING.subtract(RING.exp(RING.add(RING.x(), RING.multiply(mS, Q.TWO)), mN), C1), RING.multiply(mS, Q.TWO));
    }
    return mS.coeff(mN).multiply(mF).toZ();
  }
}
