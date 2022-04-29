package irvine.oeis.a178;
// manually egfsi at 2022-04-29 12:55

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A178964 E.g.f.: (1+sqrt(2)*sin(x/sqrt(2))*cosh(x/sqrt(2))+sin(x/sqrt(2))*sinh(x/sqrt(2)))/(cos(x/sqrt(2))*cosh(x/sqrt(2))).
 * @author Georg Fischer
 */
public class A178964 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;
  private Z mZ = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN != 0) {
      mF = mF.multiply(mN);
    }
    final Z result = RING.series(RING.add(RING.add(RING.one(),
            RING.multiply(RING.multiply(RING.pow(RING.monomial(new Q(2), 0), Q.HALF, mN),
                RING.sin(RING.series(RING.x(), RING.pow(RING.monomial(new Q(2), 0), Q.HALF, mN), mN), mN), mN),
              RING.cosh(RING.series(RING.x(), RING.pow(RING.monomial(new Q(2), 0), Q.HALF, mN), mN), mN), mN)),
          RING.multiply(RING.sin(RING.series(RING.x(), RING.pow(RING.monomial(new Q(2), 0), Q.HALF, mN), mN), mN),
            RING.sinh(RING.series(RING.x(), RING.pow(RING.monomial(new Q(2), 0), Q.HALF, mN), mN), mN), mN)),
        RING.multiply(RING.cos(RING.series(RING.x(), RING.pow(RING.monomial(new Q(2), 0), Q.HALF, mN), mN), mN),
          RING.cosh(RING.series(RING.x(), RING.pow(RING.monomial(new Q(2), 0), Q.HALF, mN), mN), mN), mN), mN)
      .coeff(mN).multiply(mF).toZ().divide(mZ);
    if ((mN & 1) == 1) {
      mZ = mZ.multiply(2);
    }
    return result;
  }
}
