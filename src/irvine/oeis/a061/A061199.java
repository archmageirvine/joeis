package irvine.oeis.a061;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061198.
 * @author Sean A. Irvine
 */
public class A061199 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);

  private int mN = -1;
  private int mM = 0;

  protected Z t(final int n, final int m) {
    Polynomial<Z> prod = RING.one();
    for (int j = 1; j <= m; ++j) {
      final long[] c = new long[j * n + 1];
      for (int k = 0; k <= n; ++k) {
        c[j * k] = 1;
      }
      prod = RING.multiply(prod, Polynomial.create(c), m);
    }
    return prod.coeff(m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN);
  }
}
