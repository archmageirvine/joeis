package irvine.oeis.a244;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A244530 Number T(n,k) of ordered unlabeled rooted trees with n nodes such that the minimal outdegree of inner nodes equals k; triangle T(n,k), n&gt;=1, 0&lt;=k&lt;=n-1, read by rows.
 * @author Georg Fischer
 */
public class A244530 extends Triangle {

  private int mN = 0;

  /** Construct the sequence. */
  public A244530() {
    setOffset(1);
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, t, k) option remember; `if`(n=0, `if`(t in [0, k],
           1, 0), `if`(t>n, 0, add(b(j-1, k$2)*
           b(n-j, max(0, t-1), k), j=1..n)))
        end:
    T:= (n, k)-> b(n-1, k$2) -`if`(n=1 and k=0, 0, b(n-1, k+1$2)):
    seq(seq(T(n, k), k=0..n-1), n=1..14);
  */
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int t, final int k) {
      if (n == 0) {
        return t == 0 || t == k ? Z.ONE : Z.ZERO;
      }
      if (t > n) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (int j = 1; j <= n; ++j) {
        sum = sum.add(get(j - 1, k, k).multiply(get(n - j, t - 1 > 0 ? t - 1 : 0, k)));
      }
      return sum;
    }
  };

  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    Z result = mB.get(n - 1, k, k);
    if (n != 1 || k != 0) {
      result = result.subtract(mB.get(n - 1, k + 1, k + 1));
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
