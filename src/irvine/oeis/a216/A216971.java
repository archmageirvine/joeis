package irvine.oeis.a216;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A216971 Triangle read by rows: T(n,k) is the number of functions f:{1,2,...,n}-&gt;{1,2,...,n} that have exactly k nonrecurrent elements mapped to some (one or more) recurrent element. n &gt;= 1, 0 &lt;= k &lt;= n-1.
 * @author Gregory Morse
 */
public class A216971 extends Triangle {
  /** Construct the sequence. */
  public A216971() {
    setOffset(1);
  }

  @Override
  protected Z compute(final int n, final int k) {
    if (k == 0) {
      return Functions.FACTORIAL.z(n + 1);
    }
    Z sum = Z.ZERO;
    for (int r = 1; r <= n + 1 - k; ++r) {
      final int m = n + 1 - r;
      final Z forest = m == k ? Z.ONE : Z.valueOf(m).pow(m - k - 1).multiply(k);
      final Z roots = Binomial.binomial(n + 1, r).multiply(Functions.FACTORIAL.z(r)).multiply(Binomial.binomial(m, k));
      sum = sum.add(roots.multiply(forest).multiply(Z.valueOf(r).pow(k)));
    }
    return sum;
  }
}
