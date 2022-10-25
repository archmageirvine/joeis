package irvine.oeis.a032;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000081;

/**
 * A032207 Number of connected functions on n points with a loop of length 11.
 * @author Sean A. Irvine
 */
public class A032207 extends A000081 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
  private final Polynomial<Z> mB = RING.empty();
  {
    setOffset(11);
    for (int k = 0; k < 11; ++k) {
      next();
    }
  }

  @Override
  public Z next() {
    mB.add(super.next());
    return RING.pow(mB, 11, ++mN).coeff(mN)
      .add(mB.substitutePower(11, mN).coeff(mN).multiply(10))
      .divide(11);
  }
}
