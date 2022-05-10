package irvine.oeis.a194;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A194621 Triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows: T(n,k) is the number of partitions of n in which any two parts differ by at most k.
 * @author Georg Fischer
 */
public class A194621 extends Triangle {

  {
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, i, k) option remember;
          if n<0 or k<0 then 0
        elif n=0 then 1
        elif i<1 then 0
        else b(n, i-1, k-1) +b(n-i, i, k)
          fi
        end:
    T:= (n, k)-> `if`(n=0, 1, 0) +add(b(n-i, i, k), i=1..n):
    seq(seq(T(n, k), k=0..n), n=0..20);
  */
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<Z>() {
    @Override
    protected Z compute(final int n, final int i, final int k) {
      if (n < 0 || k < 0) {
        return Z.ZERO;
      }
      if (n == 0) {
        return Z.ONE;
      }
      if (i < 1) {
        return Z.ZERO;
      }
      return get(n, i - 1, k - 1).add(get(n - i, i, k));
    }
  };

  @Override
  public Z compute(final int n, final int k) {
    Z sum = n == 0 ? Z.ONE : Z.ZERO;
    for (int i = 1; i <= n; ++i) {
      sum = sum.add(mB.get(n - i, i, k));
    }
    return sum;
  }
}
