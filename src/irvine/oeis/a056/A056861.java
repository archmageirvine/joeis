package irvine.oeis.a056;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.util.Pair;

/**
 * A056861 Triangle T(n,k) is the number of restricted growth strings (RGS) of set partitions of {1..n} that have an increase at index k (1&lt;=k&lt;n).
 * @author Sean A. Irvine
 */
public class A056861 extends A056862 {

  @Override
  protected Pair<Z, Polynomial<Z>> compute(final int n, final int i, final int m, final int t) {
    if (n == 0) {
      return new Pair<>(Z.ONE, RING.zero());
    }
    Polynomial<Z> sum = RING.zero();
    Z a = Z.ZERO;
    for (int j = 1; j <= m + 1; ++j) {
      final Pair<Z, Polynomial<Z>> b = get(n - 1, j, Math.max(m, j), t + 1);
      a = a.add(b.left());
      sum = RING.add(sum, b.right());
      if (j > i) {
        sum = RING.add(sum, RING.monomial(b.left(), t));
      }
    }
    return new Pair<>(a, sum);
  }
}
