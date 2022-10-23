package irvine.oeis.a051;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051732 Number of rounds of shuffling required to restore a deck of n cards to its original order: shuffling is done by keeping first card, putting second at end of deck, keeping next, putting next at end and so on.
 * @author Sean A. Irvine
 */
public class A051732 extends Sequence1 {

  // After Andrew Howroyd

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;

  private int p(final int n, final int k) {
    int d = 2 * n + 1 - 2 * k;
    while (d < n) {
      d *= 2;
    }
    return 2 * n - d;
  }

  private int follow(final int n, final int s) {
    int t = p(n, s);
    int k = 1;
    while (t > s) {
      ++k;
      t = p(n, t);
    }
    return s == t ? k : 0;
  }

  private Polynomial<Z> cyclePoly(final int n) {
    Polynomial<Z> q = RING.zero();
    for (int k = 1; k <= n; ++k) {
      final int l = follow(n, k);
      if (l != 0) {
        q = RING.add(q, RING.monomial(Z.ONE, l));
      }
    }
    return q;
  }

  @Override
  public Z next() {
    final Polynomial<Z> cp = cyclePoly(++mN);
    Z m = Z.ONE;
    for (int k = 1; k <= cp.degree(); ++k) {
      if (!cp.coeff(k).isZero()) {
        m = m.lcm(Z.valueOf(k));
      }
    }
    return m;
  }
}
