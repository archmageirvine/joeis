package irvine.oeis.a241;

import irvine.math.MemoryFunctionInt2;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A241981 Number T(n,k) of endofunctions on [n] where the largest cycle length equals k; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A241981 extends Triangle {

  /** Construct the sequence. */
  public A241981() {
    hasRAM(true);
  }

  /* Maple:
    with(combinat):
    b:= proc(n, i) option remember; `if`(n=0, 1, `if`(i<1, 0,
          add((i-1)!^j*multinomial(n, n-i*j, i$j)/j!*
          b(n-i*j, i-1), j=0..n/i)))
        end:
    A:= (n, k)-> add(binomial(n-1, j-1)*n^(n-j)*b(j, min(j, k)), j=0..n):
    T:= (n, k)-> A(n, k) -`if`(k=0, 0, A(n, k-1)):
    seq(seq(T(n, k), k=0..n), n=0..10);
  */
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int i) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i < 1) {
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
          .multiply(get(n - i * j, i - 1)));
      }
      return sum;
    }
  };

  private final MemoryFunctionInt2<Z> mA = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      Z sum = Z.ZERO;
      for (int j = 0; j <= n; ++j) {
        sum = sum.add(Binomial.binomial(n - 1, j - 1)
          .multiply(Z.valueOf(n).pow(n - j))
          .multiply(mB.get(j, j < k ? j : k)));
      }
      return sum;
    }
  };

  @Override
  public Z compute(final int n, final int k) {
    Z result = mA.get(n, k);
    if (k != 0) {
      result = result.subtract(mA.get(n, k - 1));
    }
    return result;
  }
}
