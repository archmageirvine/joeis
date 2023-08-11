package irvine.oeis.a246;

import irvine.math.MemoryFunctionInt3;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A246609 Number T(n,k) of endofunctions on [n] whose cycle lengths are multiples of k; triangle T(n,k), n &gt;= 0, 0 &lt;= k &lt;= n, read by rows.
 * @author Georg Fischer
 */
public class A246609 extends Triangle {

  /** Construct the sequence. */
  public A246609() {
    hasRAM(true);
  }

  /* Maple:
    with(combinat):
    b:= proc(n, i, k) option remember; `if`(n=0, 1,
          `if`(i=0 or i>n, 0, add(b(n-i*j, i+k, k)*(i-1)!^j*
          multinomial(n, n-i*j, i$j)/j!, j=0..n/i)))
        end:
    T:= (n, k)->add(b(j, k$2)*n^(n-j)*binomial(n-1, j-1), j=0..n):
    seq(seq(T(n,k), k=0..n), n=0..10);
  */
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int i, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i == 0 || i > n) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      final int jmax = n / i;
      for (int j = 0; j <= jmax; ++j) {
        final int[] list = new int[j + 1];
        list[0] = n - i * j;
        for (int l = 1; l <= j; ++l) {
          list[l] = i;
        }
        sum = sum.add(MemoryFactorial.SINGLETON.factorial(i - 1).pow(j)
          .multiply(Binomial.multinomial(n, list)).divide(MemoryFactorial.SINGLETON.factorial(j))
          .multiply(get(n - i * j, i + k, k)));
      }
      return sum;
    }
  };

  @Override
  public Z compute(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int j = 0; j <= n; ++j) {
      sum = sum.add(Binomial.binomial(n - 1, j - 1)
        .multiply(Z.valueOf(n).pow(n - j))
        .multiply(mB.get(j, k, k)));
    }
    return sum;
  }
}
