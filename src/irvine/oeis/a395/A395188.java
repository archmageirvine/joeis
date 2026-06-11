package irvine.oeis.a395;

import java.util.Arrays;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395188 Triangular array T(n, k) read by rows: Row n &gt; 0 gives the coefficient of x^k in the expansion of f_n(x) = Sum_{k=0..n} T(n, k)*x^k, where T(n, n) and T(0, n) = 1 for any n. The n-th falling diagonal has the ordinary generating function: 1/f_n(x).
 * @author Sean A. Irvine
 */
public class A395188 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;
  private int mM = -1;

  private Polynomial<Z> t(final int n, final int maxK) {
    if (n == 0) {
      return RING.series(RING.one(), RING.oneMinusXToTheN(1), maxK);
    }
    final Z[] c = new Z[Math.max(maxK, n + 1)];
    Arrays.fill(c, Z.ZERO);
    c[0] = Z.ONE;
    for (int j = 1; j <= n; ++j) {
      c[j] = t(n - j, j).coeff(j);
    }
    return RING.series(RING.one(), Polynomial.create(c), maxK);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM).coeff(mM);
  }
}
