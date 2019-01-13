package irvine.oeis.a000;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A000640.
 * @author Sean A. Irvine
 */
public class A000640 extends A000598 {

  private boolean mFirst = true;
  private final A000642 mA642 = new A000642();
  private Polynomial<Q> mDen = RING.one();

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    super.next();
    mDen = RING.subtract(mDen, RING.monomial(new Q(mA642.next()), mN));
    return RING.coeff(mG, RING.pow(mDen, 3, mN), mN).toZ();
  }
}

