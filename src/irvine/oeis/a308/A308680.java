package irvine.oeis.a308;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A308680 Number T(n,k) of colored integer partitions of n such that all colors from a k-set are used and parts differ by size or by color; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A308680 extends Triangle {

  /* Maple:
    b:= proc(n, i, k) option remember; `if`(n=0, 1, `if`(i<1, 0, add((t->
          b(t, min(t, i-1), k)*binomial(k, j))(n-i*j), j=0..min(k, n/i))))
        end:
    T:= (n, k)-> add(b(n$2, k-i)*(-1)^i*binomial(k, i), i=0..k):
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
      Z sum = Z.ZERO;
      final int ni = n / i;
      final int maxj = k < ni ? k : ni;
      for (int j = 0; j <= maxj; ++j) {
        final int t = n - i * j;
        sum = sum.add(get(t, t < i - 1 ? t : i - 1, k).multiply(Binomial.binomial(k, j)));
      }
      return sum;
    }
  };

  @Override
  public Z compute(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int i = 0; i <= k; ++i) {
      sum = sum.add(mB.get(n, n, k - i).multiply(((i & 1) == 0) ? 1 : -1).multiply(Binomial.binomial(k, i)));
    }
    return sum;
  }
}
