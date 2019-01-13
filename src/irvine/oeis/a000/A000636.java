package irvine.oeis.a000;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A000636.
 * @author Sean A. Irvine
 */
public class A000636 extends A000642 {

  {
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    final Polynomial<Q> bigR = g();
    final Q a = RING.coeff(RING.one(), RING.subtract(RING.one(), bigR.shift(1)), mN);
    final Q b = RING.coeff(RING.add(RING.one(), bigR.shift(1)), RING.subtract(RING.one(), bigR.substitutePower(2).shift(2)), mN);
    return a.add(b).toZ().divide2();
  }
}

