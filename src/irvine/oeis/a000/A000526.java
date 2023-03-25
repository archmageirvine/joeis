package irvine.oeis.a000;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A000526 Number of partially labeled trees with n nodes (5 of which are labeled).
 * @author Sean A. Irvine
 */
public class A000526 extends A000081 {

  private static final Polynomial<Z> CONS = Polynomial.create(125);
  private static final Z Z24 = Z.valueOf(24);
  private static final Z Z118 = Z.valueOf(118);
  private static final Z Z204 = Z.valueOf(204);

  {
    setOffset(5);
    super.next();
    super.next();
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final int s = size();
    super.next();
    final Polynomial<Z> b = polynomial();
    final Polynomial<Z> a = RING.subtract(RING.add(RING.subtract(CONS, RING.multiply(b, Z204)), RING.multiply(RING.pow(b, 2, s), Z118)), RING.multiply(RING.pow(b, 3, s), Z24));
    final Polynomial<Z> n = RING.multiply(RING.pow(b, 5, s), a, s);
    final Polynomial<Z> d = RING.pow(RING.subtract(RING.one(), b), 7, s);
    return RING.coeff(n, d, s);
  }
}
