package irvine.oeis.a038;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A038080 Number of identity trees with 3-colored nodes.
 * @author Sean A. Irvine
 */
public class A038080 extends A038079 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Polynomial<Z> mB = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mB.add(Z.ZERO);
      return Z.ONE;
    }
    mB.add(super.next());
    return mB.coeff(mN).subtract(mB.substitutePower(2, mN).coeff(mN).add(RING.multiply(mB, mB, mN).coeff(mN)).divide2());
  }
}
