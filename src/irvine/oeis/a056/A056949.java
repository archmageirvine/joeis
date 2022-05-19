package irvine.oeis.a056;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A056949 J(1)*theta3(z) where J(1) is the series given by A056948.
 * @author Sean A. Irvine
 */
public class A056949 extends A056948 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
  private final Polynomial<Z> mJ0 = RING.empty();

  @Override
  public Z next() {
    mJ0.add(super.next());
    return RING.multiply(mJ0, ThetaFunctions.theta3z(++mN), mN).coeff(mN);
  }
}
