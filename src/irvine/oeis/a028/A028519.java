package irvine.oeis.a028;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a007.A007245;

/**
 * A028519 Character of extremal vertex operator algebra of rank 40.
 * @author Sean A. Irvine
 */
public class A028519 extends A007245 {

  private static final Z Z1240 = Z.valueOf(1240);

  @Override
  public Z next() {
    final Polynomial<Z> s = nextGf();
    final Polynomial<Z> t = RING.subtract(RING.pow(s, 5, mN), RING.multiply(RING.pow(s, 2, mN), Z1240).shift(1));
    return t.coeff(mN);
  }
}
