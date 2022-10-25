package irvine.oeis.a000;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A000444 Partially labeled rooted trees with n nodes (3 of which are labeled).
 * @author Sean A. Irvine
 */
public class A000444 extends A000081 {

  private static final Polynomial<Z> NINE = Polynomial.create(9);
  {
    setOffset(3);
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final int n = size();
    super.next();
    final Polynomial<Z> b = polynomial();
    final Polynomial<Z> a = RING.add(RING.subtract(NINE, RING.multiply(b, Z.EIGHT)), RING.multiply(RING.pow(b, 2, n), Z.TWO));
    final Polynomial<Z> m = RING.multiply(RING.pow(b, 3, n), a, n);
    final Polynomial<Z> d = RING.pow(RING.subtract(RING.one(), b), 5, n);
    return RING.coeff(m, d, n);
  }
}
