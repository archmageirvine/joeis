package irvine.oeis.a246;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A246049 Number T(n,k) of endofunctions on [n] where the smallest cycle length equals k; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A246049 extends Triangle {

  /** Construct the sequence. */
  public A246049() {
    hasRAM(true);
  }

  /* Maple:
    with(combinat):
    b:= proc(n, i) option remember; `if`(n=0, 1, `if`(i>n, 0,
          add((i-1)!^j*multinomial(n, n-i*j, i$j)/j!*
          b(n-i*j, i+1), j=0..n/i)))
        end:
    A:= (n, k)-> add(binomial(n-1, j-1)*n^(n-j)*b(j, k), j=0..n):
    T:= (n, k)-> `if`(k=0, `if`(n=0, 1, 0), A(n, k) -A(n, k+1)):
    seq(seq(T(n, k), k=0..n), n=0..12);
  */
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int i) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i > n) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      final int jmax = i == 0 ? -1 : n / i;
      for (int j = 0; j <= jmax; ++j) {
        final int[] list = new int[j + 1];
        list[0] = n - i * j;
        for (int l = 1; l <= j; ++l) {
          list[l] = i;
        }
        sum = sum.add(Functions.FACTORIAL.z(i - 1).pow(j)
          .multiply(Binomial.multinomial(n, list)).divide(Functions.FACTORIAL.z(j))
          .multiply(get(n - i * j, i + 1)));
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
          .multiply(mB.get(j, k)));
      }
      return sum;
    }
  };

  @Override
  protected Z compute(final int n, final int k) {
    if (k == 0) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    return mA.get(n, k).subtract(mA.get(n, k + 1));
  }
}
