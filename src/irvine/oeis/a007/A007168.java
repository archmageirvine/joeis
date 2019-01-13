package irvine.oeis.a007;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A007168.
 * @author Sean A. Irvine
 */
public class A007168 extends A007166 {

  @Override
  protected Z select(final Polynomial<Z> s, final Polynomial<Z> b, final int n) {
    Polynomial<Z> a = RING.one();
    for (int i = 1; i < 2 * n; i += 2) {
      a = RING.multiply(a, RING.pow(RING.oneMinusXToTheN(i), s.coeff(i), 2 * n));
    }
    return RING.coeff(RING.one(), a, 2 * n);
  }
}
