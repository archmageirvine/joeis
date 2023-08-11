package irvine.oeis.a218;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A218698 Number T(n,k) of ways to divide the partitions of n into nonempty consecutive subsequences each of which contains only equal parts and parts from distinct subsequences differ by at least k; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A218698 extends Triangle {

  /* Maple programs:
    b:= proc(n, i, k) option remember; `if`(n=0, 1, `if`(i<1, 0,
       b(n, i-1, k) +add(b(n-i*j, i-k, k), j=1..n/i)))
    end:
    T:= (n, k)-> b(n, n, k):
    seq(seq(T(n, k), k=0..n), n=0..12);
  */
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int i, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i < 1) {
        return Z.ZERO;
      }
      Z sum = get(n, i - 1, k);
      for (int j = 1; j <= n / i; ++j) {
        sum = sum.add(get(n - i * j, i - k, k));
      }
      return sum;
    }
  };

  @Override
  public Z compute(final int n, final int k) {
    return mB.get(n, n, k);
  }
}
