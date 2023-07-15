package irvine.oeis.a319;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A319501 Number T(n,k) of sets of nonempty words with a total of n letters over k-ary alphabet such that all k letters occur at least once in the set; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A319501 extends Triangle {

  /* Maple:
    h:= proc(n, i, k) option remember; `if`(n=0, 1, `if`(i<1, 0,
      add(h(n-i*j, i-1, k)*binomial(k^i, j), j=0..n/i)))
    end:
    T:= (n, k)-> add((-1)^i*binomial(k, i)*h(n$2, k-i), i=0..k):
    seq(seq(T(n, k), k=0..n), n=0..12);
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
      for (int j = 0; j <= n / i; ++j) {
        sum = sum.add(get(n - i * j, i - 1, k).multiply(Binomial.binomial(Z.valueOf(k).pow(i), Z.valueOf(j))));
      }
      return sum;
    }
  };

  @Override
  public Z compute(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int i = 0; i <= k; ++i) {
      sum = sum.add(Binomial.binomial(k, i).multiply(((i & 1) == 0) ? 1 : -1).multiply(mB.get(n, n, k - i)));
    }
    return sum;
  }
}
