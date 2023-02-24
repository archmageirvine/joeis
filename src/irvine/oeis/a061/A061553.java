package irvine.oeis.a061;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061552.
 * @author Sean A. Irvine
 */
public class A061553 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    for (int k = 1; k <= mN; ++k) {
      prod = RING.multiply(prod, RING.oneMinusXToTheN(k));
    }
    Z sum = Z.ZERO;
    for (final Z v : prod) {
      sum = sum.add(v.abs());
    }
    return sum;
  }
}
