package irvine.oeis.a064;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000081;

/**
 * A064781 Number of partially labeled rooted trees with n nodes (5 of which are labeled).
 * @author Sean A. Irvine
 */
public class A064781 extends A000081 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> P625 = Polynomial.create(625);
  private static final Z Z24 = Z.valueOf(24);
  private static final Z Z192 = Z.valueOf(192);
  private static final Z Z622 = Z.valueOf(622);
  private static final Z Z974 = Z.valueOf(974);
  private int mN = -1;
  {
    setOffset(5);
  }

  @Override
  public Z next() {
    while (++mN < 5) {
      super.next();
    }
    super.next();
    final Polynomial<Z> b = RING.create(toList());
    final Polynomial<Z> b2 = RING.multiply(b, b, mN);
    final Polynomial<Z> b3 = RING.multiply(b2, b, mN);
    final Polynomial<Z> b4 = RING.multiply(b3, b, mN);
    final Polynomial<Z> b5 = RING.multiply(b4, b, mN);
    final Polynomial<Z> u = RING.add(RING.subtract(RING.add(RING.subtract(RING.multiply(b4, Z24), RING.multiply(b3, Z192)), RING.multiply(b2, Z622)), RING.multiply(b, Z974)), P625);
    final Polynomial<Z> v = RING.pow(RING.subtract(RING.one(), b), 9, mN);
    return RING.coeff(RING.multiply(u, b5, mN), v, mN);
  }
}

