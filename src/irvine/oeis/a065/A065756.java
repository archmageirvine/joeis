package irvine.oeis.a065;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065756 Generalization of the Genocchi numbers given by the Gandhi polynomials A(n+1,r) = r^5 A(n, r + 1) - (r - 1)^5 A(n, r); A(1,r) = r^5 - (r-1)^5.
 * @author Sean A. Irvine
 */
public class A065756 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mG = null;

  @Override
  public Z next() {
    mG = mG == null
      ? RING.monomial(Z.ONE, 5)
      : RING.subtract(RING.substitute(mG, RING.onePlusXToTheN(1), Integer.MAX_VALUE), mG).shift(5);
    return mG.coeff(5);
  }
}
