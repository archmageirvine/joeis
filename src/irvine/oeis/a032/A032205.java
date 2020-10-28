package irvine.oeis.a032;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000081;

/**
 * A032205 Number of connected functions on n points with a loop of length 9.
 * @author Sean A. Irvine
 */
public class A032205 extends A000081 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
  private final Polynomial<Z> mB = RING.empty();
  {
    for (int k = 0; k < 9; ++k) {
      next();
    }
  }

  @Override
  public Z next() {
    mB.add(super.next());
    return RING.pow(mB, 9, ++mN).coeff(mN)
      .add(RING.pow(mB.substitutePower(3, mN), 3).coeff(mN).multiply2())
      .add(mB.substitutePower(9, mN).coeff(mN).multiply(8))
      .divide(9);
  }
}
