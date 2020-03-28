package irvine.oeis.a030;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030272.
 * @author Sean A. Irvine
 */
public class A030272 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1290) {
      throw new UnsupportedOperationException();
    }
    final int cube = mN * mN * mN;
    Polynomial<Z> prod = RING.one();
    for (int k = 1; k <= mN; ++k) {
      prod = RING.multiply(prod, RING.onePlusXToTheN(k * k * k), cube);
    }
    return prod.coeff(cube);
  }
}
