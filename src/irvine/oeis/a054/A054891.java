package irvine.oeis.a054;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054891.
 * @author Sean A. Irvine
 */
public class A054891 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /**
   * Cusp form of weight 1 3/2.
   * @param n maximum term to compute
   * @return polynomial of cusp form
   */
  public static Polynomial<Z> kz(final int n) {
    final Polynomial<Z> t = ThetaFunctions.theta3z(n);
    final Polynomial<Z> t4 = RING.pow(t, 4, n);
    final Polynomial<Z> u = ThetaFunctions.theta4z(n);
    final Polynomial<Z> u4 = RING.pow(u, 4, n);
    final Polynomial<Z> a = RING.divide(RING.add(RING.multiply(t4, Z.SEVEN), u4), Z.EIGHT);
    final Polynomial<Z> b = RING.divide(RING.subtract(t4, u4), Z.valueOf(16));
    return RING.multiply(RING.multiply(RING.multiply(a, b, n), u4, n), t, n);
  }

  private int mN = 0;

  @Override
  public Z next() {
    return kz(++mN).coeff(mN);
  }
}
