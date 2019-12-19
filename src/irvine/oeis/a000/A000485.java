package irvine.oeis.a000;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A000485 Partially labeled trees with n nodes (4 of which are labeled).
 * @author Sean A. Irvine
 */
public class A000485 extends A000081 {

  private static final Polynomial<Z> SIXTEEN = Polynomial.create(16);
  private static final Z Z19 = Z.valueOf(19);

  {
    super.next();
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final int n = size();
    super.next();
    final Polynomial<Z> b = polynomial();
    final Polynomial<Z> a = RING.add(RING.subtract(SIXTEEN, RING.multiply(b, Z19)), RING.multiply(RING.pow(b, 2, n), Z.SIX));
    final Polynomial<Z> m = RING.multiply(RING.pow(b, 4, n), a, n);
    final Polynomial<Z> d = RING.pow(RING.subtract(RING.one(), b), 5, n);
    return RING.coeff(m, d, n);
  }
}
