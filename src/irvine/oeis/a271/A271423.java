package irvine.oeis.a271;

import irvine.math.MemoryFunctionInt3;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A271423 Number T(n,k) of set partitions of [n] with maximal block length multiplicity equal to k; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A271423 extends Triangle {

  /** Construct the sequence. */
  public A271423() {
    super(0, 1, -1);
    hasRAM(true);
  }

  /* Maple:
    with(combinat):
    b:= proc(n, i, k) option remember; `if`(n=0, 1,
          `if`(i<1, 0, add(multinomial(n, n-i*j, i$j)
            *b(n-i*j, i-1, k)/j!, j=0..min(k, n/i))))
        end:
    T:= (n, k)-> b(n$2, k)-`if`(k=0, 0, b(n$2, k-1)):
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
      final int ni = n / i;
      final int jmax = k < ni ? k : ni;
      for (int j = 0; j <= jmax; ++j) {
        final int[] list = new int[j + 1];
        list[0] = n - i * j;
        for (int l = 1; l <= j; ++l) {
          list[l] = i;
        }
        sum = sum.add(Binomial.multinomial(n, list).multiply(get(n - i * j, i - 1, k)).divide(MemoryFactorial.SINGLETON.factorial(j)));
      }
      return sum;
    }
  };

  @Override
  public Z compute(final int n, final int k) {
    Z result = mB.get(n, n, k);
    if (k != 0) {
      result = result.subtract(mB.get(n, n, k - 1));
    }
    return result;
  }
}
