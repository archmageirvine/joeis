package irvine.oeis.a067;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067953 Number of ways to sum numbers from 1 to n to the n-th prime.
 * @author Sean A. Irvine
 */
public class A067953 extends A000040 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final int p = super.next().intValueExact();
    Polynomial<Z> f = RING.one();
    for (int k = 1; k <= mN; ++k) {
      f = RING.multiply(f, RING.onePlusXToTheN(k), p);
    }
    return f.coeff(p);
  }
}
