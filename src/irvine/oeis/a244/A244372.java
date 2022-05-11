package irvine.oeis.a244;

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A244372 Number T(n,k) of unlabeled rooted trees with n nodes and maximal outdegree (branching factor) k; triangle T(n,k), n&gt;=1, 0&lt;=k&lt;=n-1, read by rows.
 * @author Georg Fischer
 */
public class A244372 extends Triangle {

  /* Maple:
    b:= proc(n, i, t, k) option remember; `if`(n=0, 1,
          `if`(i<1, 0, add(binomial(b((i-1)$2, k$2)+j-1, j)*
           b(n-i*j, i-1, t-j, k), j=0..min(t, n/i))))
        end:
    T:= (n, k)-> b(n-1$2, k$2) -`if`(k=0, 0, b(n-1$2, k-1$2)):
    seq(seq(T(n, k), k=0..n-1), n=1..14);
  */
  protected final MemoryFunctionInt4<Z> mB = new MemoryFunctionInt4<Z>() {
    // Protected access is needed for A244407, A244410, for example.
    @Override
    protected Z compute(final int n, final int i, final int t, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i < 1) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      final int ni = n / i;
      final int jmax = t < ni ? t : ni;
      for (int j = 0; j <= jmax; ++j) {
        sum = sum.add(Binomial.binomial(get(i - 1, i - 1, k, k).add(j - 1), Z.valueOf(j)).multiply(get(n - i * j, i - 1, t - j, k)));
      }
      return sum;
    }
  };

  @Override
  public Z compute(int n, final int k) {
    ++n;
    Z result = mB.get(n - 1, n - 1, k, k);
    if (k > 0) {
      result = result.subtract(mB.get(n - 1, n - 1, k - 1, k - 1));
    }
    return result;
  }
}
