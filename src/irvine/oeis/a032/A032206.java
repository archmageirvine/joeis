package irvine.oeis.a032;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000081;

/**
 * A032206 Number of connected functions on n points with a loop of length 10.
 * @author Sean A. Irvine
 */
public class A032206 extends A000081 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
  private final Polynomial<Z> mB = RING.empty();
  {
    for (int k = 0; k < 10; ++k) {
      next();
    }
  }

  @Override
  public Z next() {
    mB.add(super.next());
    return RING.pow(mB, 10, ++mN).coeff(mN)
      .add(RING.pow(mB.substitutePower(2, mN), 5).coeff(mN))
      .add(RING.pow(mB.substitutePower(5, mN), 2).coeff(mN).multiply(4))
      .add(mB.substitutePower(10, mN).coeff(mN).multiply(5))
      .divide(10);
  }
}
