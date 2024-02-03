package irvine.oeis.a068;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068192.
 * @author Sean A. Irvine
 */
public class A068202 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    final int m = ++mN * (mN + 1) / 4 - 1;
    Polynomial<Z> prod = RING.one();
    for (int k = 1; k <= mN; ++k) {
      prod = RING.multiply(prod, RING.onePlusXToTheN(k), m);
    }
    return m >= 0 ? prod.coeff(m) : Z.ZERO;
  }
}
