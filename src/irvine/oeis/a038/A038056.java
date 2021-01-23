package irvine.oeis.a038;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A038056 Number of trees with n 2-colored nodes.
 * @author Sean A. Irvine
 */
public class A038056 extends A038055 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Polynomial<Z> mB = RING.empty();
  {
    mB.add(Z.ZERO);
  }
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    mB.add(super.next());
    return mB.coeff(mN).add(mB.substitutePower(2, mN).coeff(mN).subtract(RING.multiply(mB, mB, mN).coeff(mN)).divide2());
  }
}
