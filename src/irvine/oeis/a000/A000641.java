package irvine.oeis.a000;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A000641 Number of paraffins C_n H_{2n-1} X_3 with n carbon atoms.
 * @author Sean A. Irvine
 */
public class A000641 extends A000598 {

  private static final Polynomial<Q> TWO = RING.monomial(Q.TWO, 0);
  private static final Polynomial<Q> THREE = RING.monomial(Q.THREE, 0);
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
    //System.out.println("R=" + mR);
    final Polynomial<Q> d = RING.subtract(RING.one(), RING.shift(mR, 1));
    final Polynomial<Q> a = RING.series(RING.one(), RING.pow(d, 3, mN), mN);
    final Polynomial<Q> b = RING.series(THREE, RING.multiply(d, RING.subtract(RING.one(), RING.shift(mR.substitutePower(2, mN), 2)), mN), mN);
    final Polynomial<Q> c = RING.series(TWO, RING.subtract(RING.one(), RING.shift(mR.substitutePower(3, mN), 3)), mN);
    return RING.multiply(mG, RING.add(RING.add(a, b), c)).coeff(mN).divide(6).toZ();
  }
}

