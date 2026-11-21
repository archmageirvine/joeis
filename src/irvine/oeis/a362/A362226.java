package irvine.oeis.a362;

import irvine.math.MemoryFunction1;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a003.A003030;
import irvine.oeis.triangle.Triangle;

/**
 * A362226 Triangular array read by rows.  T(n,k) is the number of labeled digraphs on [n] with exactly k isolated strongly connected components, n&gt;=0, 0&lt;=k&lt;=n.
 * @author Gregory Morse
 */
public class A362226 extends Triangle {
  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final DirectSequence mStrong = DirectSequence.create(new A003030());
  private final MemoryFunction1<Polynomial<Z>> mMarked = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Z> compute(final int n) {
      if (n == 0) {
        return RING.one();
      }
      Polynomial<Z> sum = RING.zero();
      for (int k = 1; k <= n; ++k) {
        sum = RING.add(sum, RING.multiply(get(n - k), Binomial.binomial(n - 1, k - 1).multiply(mStrong.a(k))));
      }
      return RING.subtract(sum.shift(1), sum);
    }
  };

  @Override
  protected Z compute(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int j = k; j <= n; ++j) {
      final int m = n - j;
      sum = sum.add(mMarked.get(j).coeff(k).multiply(Binomial.binomial(n, j)).shiftLeft((long) m * (m - 1)));
    }
    return sum;
  }
}
