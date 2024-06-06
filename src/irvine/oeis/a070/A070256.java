package irvine.oeis.a070;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070256 Define P(n,X) by the recursion P(1,X) = 1, P(n+1,X) = (P(n,X)+X)^2; then a(1) = 0 and for n &gt; 1 a(n) is the coefficient of X^(2^(n-2)) in P(n,X) of degree 2^(n-1).
 * @author Sean A. Irvine
 */
public class A070256 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mP = null;

  @Override
  public Z next() {
    if (mP == null) {
      mP = RING.one();
      return Z.ZERO;
    } else {
      mP = RING.pow(RING.add(mP, RING.x()), 2);
    }
    return mP.coeff(mP.degree() / 2);
  }
}
