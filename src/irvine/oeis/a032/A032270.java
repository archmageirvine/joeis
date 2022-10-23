package irvine.oeis.a032;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A032270 "DIJ" (bracelet, indistinct, labeled) transform of 1,3,5,7,...
 * @author Sean A. Irvine
 */
public class A032270 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C1 = RING.create(Arrays.asList(Q.NEG_ONE, Q.TWO));
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    final Polynomial<Q> g = RING.add(RING.one(), RING.multiply(RING.exp(RING.x(), mN), C1));
    return RING.divide(RING.subtract(RING.add(g, RING.divide(RING.pow(g, 2, mN), Q.TWO)), RING.log1p(RING.negate(g), mN)), Q.TWO).coeff(mN).multiply(mF).toZ();
  }
}
