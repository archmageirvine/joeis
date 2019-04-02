package irvine.oeis.a003;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000081;

/**
 * A003237 Number of partially achiral planted trees with n nodes.
 * @author Sean A. Irvine
 */
public class A003237 extends A000081 {

  private int mN = -2;

  protected Polynomial<Z> pi() {
    final Polynomial<Z> g = polynomial().substitutePower(2, mN + 1);
    return RING.series(g, RING.subtract(RING.x(), g), mN);
  }

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.ZERO;
    }
    super.next();
    return pi().coeff(mN);
  }
}
