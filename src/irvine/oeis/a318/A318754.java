package irvine.oeis.a318;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A318754 Number T(n,k) of rooted trees with n nodes such that k equals the maximal number of subtrees extending from the same node and having the same number of nodes; triangle T(n,k), n&gt;=1, 0&lt;=k&lt;=n-1, read by rows.
 * @author Georg Fischer
 */
public class A318754 extends Triangle {

  private int mN = 0;

  /** Construct the sequence. */
  public A318754() {
    setOffset(1);
    hasRAM(true);
  }

  /* Maple:
    g:= proc(n, i, k) option remember; `if`(n=0, 1, `if`(i<1, 0, add(
          binomial(g(i-1$2, k)+j-1, j)*g(n-i*j, i-1, k), j=0..min(k, n/i))))
        end:
    T:= (n, k)-> g(n-1$2, k) -`if`(k=0, 0, g(n-1$2, k-1)):
    seq(seq(T(n, k), k=0..n-1), n=1..14);
  */
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<Z>() {
    @Override
    protected Z compute(final int n, final int i, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i < 1) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      final int ni = n / i;
      final int maxj = k < ni ? k : ni;
      for (int j = 0; j <= maxj; ++j) {
        sum = sum.add(Binomial.binomial(get(i - 1, i - 1, k).add(j - 1), Z.valueOf(j)).multiply(get(n - i * j, i - 1, k)));
      }
      return sum;
    }
  };

  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    return mB.get(n - 1, n - 1, k).subtract(k == 0 ? Z.ZERO : mB.get(n - 1, n - 1, k - 1));
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return super.next();
  }
}
