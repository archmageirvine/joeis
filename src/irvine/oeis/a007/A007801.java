package irvine.oeis.a007;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007801 Expansion of <code>f(f(x))</code>, where f <code>= x + x^2 + x^4 + x^8 + x^16 +</code> ...
 * @author Sean A. Irvine
 */
public class A007801 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mP = RING.zero();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    if ((mN & (mN - 1)) == 0) {
      mP = RING.add(mP, RING.monomial(Z.ONE, mN));
    }
    return RING.substitute(mP, mP, mN).coeff(mN);
  }
}
