package irvine.oeis.a056;

import irvine.math.MemoryFunctionInt4;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A056862 Triangle T(n,k) is the number of restricted growth strings (RGS) of set partitions of {1..n} that have a decrease at index k (1&lt;=k&lt;n).
 * @author Sean A. Irvine
 */
public class A056862 extends MemoryFunctionInt4<Pair<Z, Polynomial<Z>>> implements Sequence {

  // After Alois P. Heinz

  protected static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 1;
  private int mM = 1;

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
      if (j < i) {
        sum = RING.add(sum, RING.monomial(b.left(), t));
      }
    }
    return new Pair<>(a, sum);
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, 1, 0, 0).right().coeff(mM);
  }
}
