package irvine.oeis.a131;
// manually egfsi/egfsie at 2022-04-29 11:22

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A131638 Increasing binary trees having exactly two vertices with outdegree 1.
 * E.g.f.: (3*sec(x/sqrt(2))^2*tan(x/sqrt(2))^2-x*sec(x/sqrt(2))^2*tan(x/sqrt(2))/(sqrt(2)))/2, even powers
 * @author Georg Fischer
 */
public class A131638 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private Z mF = Z.ONE;
  private Z mZ = Z.TWO;

  @Override
  public Z next() {
    ++mN;
    if (mN != 0) {
      mF = mF.multiply(mN);
    }
    ++mN;
    mF = mF.multiply(mN);
    final Z result = RING.series(RING.subtract(RING.multiply(RING.multiply(RING.monomial(Q.THREE, 0),
            RING.pow(RING.sec(RING.series(RING.x(), RING.pow(RING.monomial(Q.TWO, 0), Q.HALF, mN), mN), mN), 2, mN), mN),
          RING.pow(RING.tan(RING.series(RING.x(), RING.pow(RING.monomial(Q.TWO, 0), Q.HALF, mN), mN), mN), 2, mN), mN),
        RING.series(RING.multiply(RING.multiply(RING.x(), RING.pow(RING.sec(RING.series(RING.x(),
          RING.pow(RING.monomial(Q.TWO, 0), Q.HALF, mN), mN), mN), 2, mN), mN), RING.tan(RING.series(RING.x(),
          RING.pow(RING.monomial(Q.TWO, 0), Q.HALF, mN), mN), mN), mN), RING.pow(RING.monomial(Q.TWO, 0), Q.HALF, mN), mN)),
      RING.monomial(Q.TWO, 0), mN).coeff(mN).multiply(mF).toZ().divide(mZ);
    mZ = mZ.multiply(2);
    return result;
  }
}
