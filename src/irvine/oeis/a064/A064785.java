package irvine.oeis.a064;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000081;

/**
 * A064785 Number of partially labeled trees with n nodes (6 of which are labeled).
 * @author Sean A. Irvine
 */
public class A064785 extends A000081 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> P1296 = Polynomial.create(1296);
  private static final Z Z2633 = Z.valueOf(2633);
  private static final Z Z2128 = Z.valueOf(2128);
  private static final Z Z806 = Z.valueOf(806);
  private static final Z Z120 = Z.valueOf(120);
  private int mN = -1;
  {
    setOffset(6);
  }

  @Override
  public Z next() {
    while (++mN < 6) {
      super.next();
    }
    super.next();
    final Polynomial<Z> b = RING.create(toList());
    final Polynomial<Z> b2 = RING.multiply(b, b, mN);
    final Polynomial<Z> b3 = RING.multiply(b2, b, mN);
    final Polynomial<Z> b4 = RING.multiply(b3, b, mN);
    final Polynomial<Z> b6 = RING.multiply(b4, b2, mN);
    final Polynomial<Z> u = RING.add(RING.subtract(RING.add(RING.subtract(P1296, RING.multiply(b, Z2633)), RING.multiply(b2, Z2128)), RING.multiply(b3, Z806)), RING.multiply(b4, Z120));
    final Polynomial<Z> v = RING.pow(RING.subtract(RING.one(), b), 9, mN);
    return RING.coeff(RING.multiply(u, b6, mN), v, mN);
  }
}

