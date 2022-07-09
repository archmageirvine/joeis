package irvine.oeis.a000;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A000639 Number of alkyl benzenes with n carbon atoms: C(n)H(2n-6).
 * @author Sean A. Irvine
 */
public class A000639 extends A000598 {

  private static final Q FOUR = Q.FOUR;
  private int mL = 0;


  @Override
  public Z next() {
    if (mL < 5) {
      ++mL;
      return Z.ZERO;
    }
    super.next();
    final Polynomial<Q> g2 = mG.substitutePower(2, mN);
    return RING.add(RING.add(RING.add(RING.add(RING.pow(mG, 6, mN),
      RING.multiply(RING.pow(g2, 3, mN), FOUR)),
      RING.multiply(RING.pow(mG.substitutePower(3, mN), 2, mN), Q.TWO)),
      RING.multiply(RING.multiply(RING.pow(mG, 2, mN), RING.pow(g2, 2, mN), mN), Q.THREE)),
      RING.multiply(mG.substitutePower(6, mN), Q.TWO))
      .coeff(mN).divide(12).toZ();
  }
}

