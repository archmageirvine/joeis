package irvine.oeis.a058;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A058626 McKay-Thompson series of class 30e for Monster.
 * @author Sean A. Irvine
 */
public class A058626 extends A058513 {

  private static final Polynomial<Q> TWO = Polynomial.create(Q.ZERO, Q.ZERO, Q.TWO);
  private static final Polynomial<Q> FIVE = Polynomial.create(Q.ZERO, Q.ZERO, Q.FIVE);
  private final Polynomial<Q> mT = RING.empty();

  @Override
  public Z next() {
    mT.add(new Q(super.next()));
    final Polynomial<Q> t2 = mT.substitutePower(2, mN);
    final Polynomial<Q> s = RING.add(mT.shift(1), t2);
    final Polynomial<Q> prod = RING.multiply(mT, t2, mN);
    final Polynomial<Q> num = RING.add(RING.add(TWO, s).shift(1), prod);
    final Polynomial<Q> den = RING.add(FIVE, s);
    return RING.coeff(num, den, mN).toZ();
  }
}
