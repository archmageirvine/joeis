package irvine.oeis.a246;

import irvine.math.MemoryFunctionInt3;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A246522 Number A(n,k) of endofunctions on [n] whose cycle lengths are divisors of k; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A246522 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A246522() {
    super(0, 0, -1);
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, i, k) option remember; `if`(n=0, 1, `if`(i<1, 0,
          add(multinomial(n, n-i*j, i$j)/j!*b(n-i*j, i-1, k)*
          (i-1)!^j, j=0..`if`(irem(k, i)=0, n/i, 0))))
        end:
    A:=(n, k)->add(b(j, min(k, j), k)*n^(n-j)*binomial(n-1, j-1), j=0..n):
    seq(seq(A(n, d-n), n=0..d), d=0..12);
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
      final int jmax = k % i == 0 ? n / i : 0;
      for (int j = 0; j <= jmax; ++j) {
        final int[] list = new int[j + 1];
        list[0] = n - i * j;
        for (int l = 1; l <= j; ++l) {
          list[l] = i;
        }
        sum = sum.add(MemoryFactorial.SINGLETON.factorial(i - 1).pow(j)
          .multiply(Binomial.multinomial(n, list)).divide(MemoryFactorial.SINGLETON.factorial(j))
          .multiply(get(n - i * j, i - 1, k)));
      }
      return sum;
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int j = 0; j <= n; ++j) {
      sum = sum.add(Binomial.binomial(n - 1, j - 1)
        .multiply(Z.valueOf(n).pow(n - j))
        .multiply(mB.get(j, k < j ? k : j, k)));
    }
    return sum;
  }
}
