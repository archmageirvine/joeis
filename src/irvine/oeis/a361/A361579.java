package irvine.oeis.a361;

import irvine.math.MemoryFunction1;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A361579 Triangular array read by rows. T(n,k) is the number of labeled digraphs on [n] with exactly k source-like components, n &gt;= 0, 0 &lt;= k &lt;= n.
 * @author Gregory Morse
 */
public class A361579 extends A361455 {

  private static final Polynomial<Z> MARK = Polynomial.create(1, -1);
  private final MemoryFunction1<Polynomial<Z>> mRowsBySources = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Z> compute(final int n) {
      Polynomial<Z> sum = RING.zero();
      for (int k = 0; k <= n; ++k) {
        final Z choices = Binomial.binomial(n, k).shiftLeft((long) (n - 1) * (n - k));
        sum = RING.add(sum, RING.multiply(sourceSets(k), choices));
      }
      return sum;
    }
  };

  @Override
  protected Polynomial<Z> component(final int n) {
    // Each source SCC can be left unmarked or selected with weight x - 1.
    return RING.multiply(MARK, strong(n));
  }

  @Override
  protected Z compute(final int n, final int k) {
    return mRowsBySources.get(n).coeff(k);
  }
}
