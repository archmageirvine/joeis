package irvine.oeis.a243;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A243978 Triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows: T(n,k) is the number of partitions of n where the minimal multiplicity of any part is k.
 * @author Georg Fischer
 */
public class A243978 extends Triangle {

  /* Maple:
    b:= proc(n, i, k) option remember; `if`(n=0, 1, `if`(i<1, 0,
          b(n, i-1, k) +add(b(n-i*j, i-1, k), j=max(1, k)..n/i)))
        end:
    T:= (n, k)-> b(n$2, k) -`if`(n=0 and k=0, 0, b(n$2, k+1)):
    seq(seq(T(n, k), k=0..n), n=0..14);
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
      final int jmax = n / i;
      for (int j = Math.max(1, k); j <= jmax; ++j) {
        sum = sum.add(get(n - i * j, i - 1, k));
      }
      return sum;
    }
  };

  @Override
  public Z compute(final int n, final int k) {
    Z result = mB.get(n, n, k);
    if (n != 0 || k != 0) {
      result = result.subtract(mB.get(n, n, k + 1));
    }
    return result;
  }
}
