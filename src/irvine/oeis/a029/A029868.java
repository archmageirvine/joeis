package irvine.oeis.a029;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000081;

/**
 * A029868 Number of connected functions on n points with a loop of length 5.
 * @author Sean A. Irvine
 */
public class A029868 extends A000081 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
  private final Polynomial<Z> mB = RING.empty();
  {
    next();
    next();
    next();
    next();
    next();
  }

  @Override
  public Z next() {
    mB.add(super.next());
    return RING.pow(mB, 5, ++mN).coeff(mN).add(mB.substitutePower(5, mN).coeff(mN).multiply(4)).divide(5);
  }
}
