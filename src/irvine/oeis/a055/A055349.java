package irvine.oeis.a055;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055349 Triangle of labeled mobiles (circular rooted trees) with n nodes and k leaves.
 * @author Sean A. Irvine
 */
public class A055349 extends Sequence1 {

  private static final PolynomialRingField<Q> RING_Y = new PolynomialRingField<>("y", Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(RING_Y);
  private static final Polynomial<Polynomial<Q>> Y = RING.monomial(RING_Y.x(), 0);
  private static final Polynomial<Polynomial<Q>> XY = Y.shift(1);
  private Polynomial<Polynomial<Q>> mGf = XY;
  private int mN = 1;
  private int mM = 0;
  private Z mF = Z.ONE;

  // E.g.f. satisfies A(x, y)=xy-x*log(1-A(x, y))
  private void step() {
    mGf = RING.subtract(Y, RING.log1p(RING.negate(mGf), mN + 2)).shift(1);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      mF = mF.multiply(++mN);
      mM = 1;
      step();
    }
    return mGf.coeff(mN).coeff(mM).multiply(mF).toZ();
  }
}
