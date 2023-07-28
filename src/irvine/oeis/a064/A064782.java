package irvine.oeis.a064;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000081;

/**
 * A064782 Number of partially labeled rooted trees with n nodes (6 of which are labeled).
 * @author Sean A. Irvine
 */
public class A064782 extends A000081 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> P7776 = Polynomial.create(7776);
  private static final Z Z14543 = Z.valueOf(14543);
  private static final Z Z11758 = Z.valueOf(11758);
  private static final Z Z5126 = Z.valueOf(5126);
  private static final Z Z1200 = Z.valueOf(1200);
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
    final Polynomial<Z> b5 = RING.multiply(b4, b, mN);
    final Polynomial<Z> b6 = RING.multiply(b5, b, mN);
    final Polynomial<Z> u = RING.subtract(RING.add(RING.subtract(RING.add(RING.subtract(P7776, RING.multiply(b, Z14543)), RING.multiply(b2, Z11758)), RING.multiply(b3, Z5126)), RING.multiply(b4, Z1200)), RING.multiply(b5, Z120));
    final Polynomial<Z> v = RING.pow(RING.subtract(RING.one(), b), 11, mN);
    return RING.coeff(RING.multiply(u, b6, mN), v, mN);
  }
}

