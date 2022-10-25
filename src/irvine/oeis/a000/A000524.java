package irvine.oeis.a000;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A000524 Number of rooted trees with n nodes, 2 of which are labeled.
 * @author Sean A. Irvine
 */
public class A000524 extends A000081 {

  private static final Polynomial<Z> TWO = Polynomial.create(2);

  {
    setOffset(2);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final int s = size();
    super.next();
    final Polynomial<Z> b = polynomial();
    final Polynomial<Z> n = RING.multiply(RING.subtract(TWO, b), RING.pow(b, 2, s), s);
    final Polynomial<Z> d = RING.pow(RING.subtract(RING.one(), b), 3, s);
    return RING.coeff(n, d, s);
  }
}
