package irvine.oeis.a000;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A000645 Number of alkyls X^{II} C_n H_{2n+1} Y with n carbon atoms.
 * @author Sean A. Irvine
 */
public class A000645 extends A000598 {

  private final A000642 mA642 = new A000642();
  private Polynomial<Q> mR = RING.one();

  @Override
  public Z next() {
    super.next();
    mR = RING.subtract(mR, RING.monomial(new Q(mA642.next()), mN));
    return RING.coeff(mG, mR, mN).toZ();
  }
}

