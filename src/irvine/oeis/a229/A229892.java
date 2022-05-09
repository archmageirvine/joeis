package irvine.oeis.a229;

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A229892 Number T(n,k) of k up, k down permutations of [n]; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A229892 extends Triangle {

  /* Maple program:
    b:= proc(u, o, t, k) option remember; `if`(u+o=0, 1, add(`if`(t=k,
       b(o-j, u+j-1, 1, k), b(u+j-1, o-j, t+1, k)), j=1..o))
    end:
    T:= (n, k)-> `if`(k+1>=n, 1, `if`(k=0, 0, b(0, n, 0, k))):
    seq(seq(T(n, k), k=0..n), n=0..10);
  */
  private final MemoryFunctionInt4<Z> mB = new MemoryFunctionInt4<Z>() {
    @Override
    protected Z compute(final int u, final int o, final int t, final int k) {
      if (u + o == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int j = 1; j <= o; ++j) {
        sum = sum.add(t == k ? get(o - j, u + j - 1, 1, k) : get(u + j - 1, o - j, t + 1, k));
      }
      return sum;
    }
  };

  @Override
  protected Z compute(final int n, final int k) {
    if (k + 1 >= n) {
      return Z.ONE;
    }
    if (k == 0) {
      return Z.ZERO;
    }
    return mB.get(0, n, 0, k);
  }
}
