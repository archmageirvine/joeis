package irvine.oeis.a000;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A000678.
 * @author Sean A. Irvine
 */
public class A000678 extends A000598 {

  private static final Q Q24 = new Q(24);
  private static final Q SIX = new Q(6);
  private static final Q EIGHT = new Q(8);

  protected Polynomial<Q> mQ = null;

  @Override
  public Z next() {
    super.next();
    final Polynomial<Q> g2 = mG.substitutePower(2, mN);
    mQ = RING.shift(RING.divide(RING.add(RING.add(RING.add(RING.add(RING.pow(mG, 4),
      RING.multiply(RING.multiply(RING.multiply(g2, mG), mG), SIX)),
      RING.multiply(RING.pow(g2, 2), Q.THREE)),
      RING.multiply(RING.multiply(mG.substitutePower(3, mN), mG), EIGHT)),
      RING.multiply(mG.substitutePower(4, mN), SIX)),
      Q24), 1);
    return mQ.coeff(mN).toZ();
  }
}

