package irvine.oeis.a000;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A000525 Partially labeled rooted trees with n nodes (4 of which are labeled).
 * @author Sean A. Irvine
 */
public class A000525 extends A000081 {

  private static final Polynomial<Z> SIXTYFOUR = Polynomial.create(64);
  private static final Z Z36 = Z.valueOf(36);
  private static final Z Z79 = Z.valueOf(79);

  {
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
    final Polynomial<Z> a = RING.subtract(RING.add(RING.subtract(SIXTYFOUR, RING.multiply(b, Z79)), RING.multiply(RING.pow(b, 2, s), Z36)), RING.multiply(RING.pow(b, 3, s), Z.SIX));
    final Polynomial<Z> n = RING.multiply(RING.pow(b, 4, s), a, s);
    final Polynomial<Z> d = RING.pow(RING.subtract(RING.one(), b), 7, s);
    return RING.coeff(n, d, s);
  }
}
