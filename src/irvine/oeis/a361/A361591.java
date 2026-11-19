package irvine.oeis.a361;

import irvine.math.MemoryFunction1;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A361591 Triangle read by rows: T(n,k) is the number of weakly connected simple digraphs on n labeled nodes with k strongly connected components.
 * @author Gregory Morse
 */
public class A361591 extends A361455 {
  private final MemoryFunction1<Polynomial<Z>> mConnected = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Z> compute(final int n) {
      Polynomial<Z> sum = row(n);
      for (int k = 1; k < n; ++k) {
        final Polynomial<Z> term = RING.multiply(get(k), row(n - k));
        sum = RING.subtract(sum, RING.multiply(term, Binomial.binomial(n - 1, k - 1)));
      }
      return sum;
    }
  };

  @Override
  protected Z compute(final int n, final int k) {
    return mConnected.get(n).coeff(k);
  }
}
