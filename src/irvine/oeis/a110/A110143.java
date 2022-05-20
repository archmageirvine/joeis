package irvine.oeis.a110;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A110143 Row sums of triangle A110141.
 * @author Sean A. Irvine
 */
public class A110143 extends A000142 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Polynomial<Z> mB = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mB.add(super.next());
    Polynomial<Z> prod = mB;
    for (int k = 2; k <= mN; ++k) {
      prod = RING.multiply(prod, RING.substitute(mB, RING.monomial(Z.valueOf(k), k), mN), mN);
    }
    return prod.coeff(mN);
  }
}
