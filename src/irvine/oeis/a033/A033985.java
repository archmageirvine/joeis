package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033985 Number of partitions of n into two or more distinct nonzero squares.
 * @author Sean A. Irvine
 */
public class A033985 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    for (int k = 1; k * k <= mN; ++k) {
      prod = RING.multiply(prod, RING.onePlusXToTheN(k * k), mN);
    }
    final long s = Functions.SQRT.l((long) mN);
    return prod.coeff(mN).subtract(s * s == mN ? 1 : 0);
  }
}
