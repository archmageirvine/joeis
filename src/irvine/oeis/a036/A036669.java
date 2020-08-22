package irvine.oeis.a036;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000598;

/**
 * A036669 G.f.: A(x) = x*cycle_index(S4, B(x)-1), where B(x) is g.f. for A000598.
 * @author Sean A. Irvine
 */
public class A036669 extends A000598 {

  private static final Q SIX = new Q(6);
  private static final Q EIGHT = new Q(8);
  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    super.next();
    final Polynomial<Q> b = RING.subtract(mG, RING.one());
    final Polynomial<Q> g2 = b.substitutePower(2, mN);
    return RING.add(RING.add(RING.add(RING.add(RING.pow(b, 4),
      RING.multiply(RING.multiply(RING.multiply(g2, b), b), SIX)),
      RING.multiply(RING.pow(g2, 2), Q.THREE)),
      RING.multiply(RING.multiply(b.substitutePower(3, mN), b), EIGHT)),
      RING.multiply(b.substitutePower(4, mN), SIX))
      .coeff(mN).divide(24).toZ();
  }
}

