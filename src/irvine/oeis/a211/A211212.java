package irvine.oeis.a211;
// manually egfsi at 2022-04-29 12:55

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A211212 4-alternating permutations of length 4n.
 * @author Georg Fischer
 */
public class A211212 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;
  private Z mZ = Z.ONE;

  @Override
  public Z next() {
    if (++mN != 0) {
      mF = mF.multiply(mN);
      mZ = mZ.multiply(4);
    }
    final Z result = RING.series(RING.one(), RING.multiply(RING.cos(RING.series(RING.x(), RING.pow(RING.monomial(new Q(2), 0), Q.HALF, mN), mN), mN), RING.cosh(RING.series(RING.x(), RING.pow(RING.monomial(new Q(2), 0), Q.HALF, mN), mN), mN), mN), mN).coeff(mN).multiply(mF).toZ().divide(mZ);
    ++mN;
    mF = mF.multiply(mN);
    ++mN;
    mF = mF.multiply(mN);
    ++mN;
    mF = mF.multiply(mN);
    return result;
  }
}
