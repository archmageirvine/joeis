package irvine.oeis.a244;

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A244454 Number T(n,k) of unlabeled rooted trees with n nodes such that the minimal outdegree of inner nodes equals k; triangle T(n,k), n&gt;=1, 0&lt;=k&lt;=n-1, read by rows.
 * @author Georg Fischer
 */
public class A244454 extends Triangle {

  private int mN = 0;

  /** Construct the sequence. */
  public A244454() {
    setOffset(1);
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, i, t, k) option remember; `if`(n=0, `if`(t in [0, k],
          1, 0), `if`(i<1, 0, add(binomial(b((i-1)$2, k$2)+j-1, j)*
          b(n-i*j, i-1, max(0, t-j), k), j=0..n/i)))
        end:
    T:= (n, k)-> b(n-1$2, k$2) -`if`(n=1 and k=0, 0, b(n-1$2, k+1$2)):
    seq(seq(T(n, k), k=0..n-1), n=1..14);
  */
  private final MemoryFunctionInt4<Z> mB = new MemoryFunctionInt4<>() {
    @Override
    protected Z compute(final int n, final int i, final int t, final int k) {
      if (n == 0) {
        return t == 0 || t == k ? Z.ONE : Z.ZERO;
      }
      if (i < 1) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      final int jmax = n / i;
      for (int j = 0; j <= jmax; ++j) {
        sum = sum.add(Binomial.binomial(get(i - 1, i - 1, k, k).add(j - 1), Z.valueOf(j)).multiply(get(n - i * j, i - 1, t - j > 0 ? t - j : 0, k)));
      }
      return sum;
    }
  };

  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    Z result = mB.get(n - 1, n - 1, k, k);
    if (n != 0 || k != 0) {
      result = result.subtract(mB.get(n - 1, n - 1, k + 1, k + 1));
    }
    return result;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return super.next();
  }
}
