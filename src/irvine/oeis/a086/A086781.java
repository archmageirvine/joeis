package irvine.oeis.a086;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086781 a(n) is the number of nonzero terms in the expansion of (x-y) * (x^2-y^2) * (x^3-y^3) * ... * (x^n-y^n).
 * @author Sean A. Irvine
 */
public class A086781 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mA = RING.one();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = RING.multiply(mA, RING.oneMinusXToTheN(mN));
    }
    long cnt = 0;
    for (int k = 0; k <= mA.degree(); ++k) {
      if (!mA.coeff(k).isZero()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
