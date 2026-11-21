package irvine.oeis.a296;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A296546 Triangle read by rows T(n,k): number of undirected cycles of length k in the complete tripartite graph K_{n,n,n} (n = 1...; k = 3..3n).
 * @author Gregory Morse
 */
public class A296546 extends Sequence1 {
  // After Andrew Howroyd.
  private int mN = 0;
  private int mK = 2;

  protected static Z count(final int n, final int k, final int i, final int j, final int p) {
    final Z first = Binomial.binomial(n, k).multiply(Functions.FACTORIAL.z(k - 1));
    final Z other = Binomial.binomial(n, i + p).multiply(Functions.FACTORIAL.z(i + p)).multiply(Binomial.binomial(n, j + p)).multiply(Functions.FACTORIAL.z(j + p));
    final Z positions = Binomial.binomial(k, i).multiply(Binomial.binomial(k - i, j)).multiply(Binomial.binomial(p + i + j - 1, k - 1));
    return first.multiply(other).multiply(positions).shiftLeft(k - i - j);
  }

  protected static Z cycles(final int n, final int length) {
    Z sum = Z.ZERO;
    for (int k = 1; k <= Math.min(n, length); ++k) {
      for (int i = 0; i <= k; ++i) {
        for (int j = 0; j <= k - i; ++j) {
          final int left = length - k - i - j;
          if ((left & 1) == 0) {
            final int p = left / 2;
            if (p >= k - i - j && p <= n - Math.max(i, j)) {
              sum = sum.add(count(n, k, i, j, p));
            }
          }
        }
      }
    }
    // Cycles with no vertex in the first part are bipartite.
    if ((length & 1) == 0) {
      final int k = length / 2;
      sum = sum.add(Binomial.binomial(n, k).square().multiply(Functions.FACTORIAL.z(k)).multiply(Functions.FACTORIAL.z(k - 1)));
    }
    return sum.divide2();
  }

  @Override
  public Z next() {
    if (++mK > 3 * mN) {
      ++mN;
      mK = 3;
    }
    return cycles(mN, mK);
  }
}
