package irvine.oeis.a022;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000598;
import irvine.oeis.a000.A000642;

/**
 * A022014 Tri-substituted alkanes of form C_n H_{2n-1} X_2 Y, or equivalently bi-substituted alkyls of form -C_n H_{2n-1} X_2 (n=1: CHXXY; n=2: CXXY-CHHH CXYH-CXHH CXXH-CYHH).
 * @author Sean A. Irvine
 */
public class A022014 extends A000598 {

  private boolean mFirst = true;
  private final A000642 mA642 = new A000642();
  private Polynomial<Q> mR = RING.one();

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    super.next();
    final Z t = mA642.next();
    if (mN > 1) {
      mR = RING.add(mR, RING.monomial(new Q(t), mN - 1));
    }
    final Polynomial<Q> d = RING.subtract(RING.one(), RING.shift(mR, 1));
    final Polynomial<Q> a = RING.series(RING.one(), RING.pow(d, 2, mN), mN);
    final Polynomial<Q> b = RING.series(RING.one(), RING.subtract(RING.one(), RING.shift(mR.substitutePower(2, mN), 2)), mN);
    return RING.multiply(RING.series(mG, d, mN), RING.add(a, b)).coeff(mN).toZ().divide2();
  }
}

