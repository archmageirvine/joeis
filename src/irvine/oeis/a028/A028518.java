package irvine.oeis.a028;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a007.A007245;

/**
 * A028518 Character of extremal vertex operator algebra of rank 32.
 * @author Sean A. Irvine
 */
public class A028518 extends A007245 {

  private static final Z Z992 = Z.valueOf(992);

  @Override
  public Z next() {
    final Polynomial<Z> s = nextGf();
    final Polynomial<Z> t = RING.subtract(RING.pow(s, 4, mN), RING.multiply(s, Z992).shift(1));
    return t.coeff(mN);
  }
}
