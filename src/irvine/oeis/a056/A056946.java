package irvine.oeis.a056;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A056946 Coefficients of J(0)*theta_3(z) where J(0) is sequence A056945.
 * @author Sean A. Irvine
 */
public class A056946 extends A056945 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
  private final Polynomial<Z> mJ0 = RING.empty();

  @Override
  public Z next() {
    mJ0.add(super.next());
    return RING.multiply(mJ0, ThetaFunctions.theta3z(++mN), mN).coeff(mN);
  }
}
