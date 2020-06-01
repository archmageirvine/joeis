package irvine.oeis.a032;

import java.util.Collections;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000081;

/**
 * A032208 Number of connected functions on n points with a loop of length 12.
 * @author Sean A. Irvine
 */
public class A032208 extends A000081 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
  private final Polynomial<Z> mB = RING.create(Collections.emptyList());
  {
    for (int k = 0; k < 12; ++k) {
      next();
    }
  }

  @Override
  public Z next() {
    mB.add(super.next());
    return RING.pow(mB, 12, ++mN).coeff(mN)
      .add(RING.pow(mB.substitutePower(2, mN), 6).coeff(mN))
      .add(RING.pow(mB.substitutePower(3, mN), 4).coeff(mN).multiply2())
      .add(RING.pow(mB.substitutePower(4, mN), 3).coeff(mN).multiply2())
      .add(RING.pow(mB.substitutePower(6, mN), 2).coeff(mN).multiply2())
      .add(mB.substitutePower(12, mN).coeff(mN).multiply(4))
      .divide(12);
  }
}
