package irvine.oeis.a036;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000600;

/**
 * A036674 G.f.: A(x) = (1/2)*x*(B(x)^2+B(x^2)), where B(x) = g.f. for A000600.
 * @author Sean A. Irvine
 */
public class A036674 extends A000600 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Polynomial<Z> mB = RING.empty();
  private int mN = -2;

  @Override
  public Z next() {
    if (++mN == -1) {
      return Z.ZERO;
    }
    mB.add(super.next());
    return RING.add(RING.pow(mB, 2, mN), mB.substitutePower(2, mN)).coeff(mN).divide2();
  }
}
