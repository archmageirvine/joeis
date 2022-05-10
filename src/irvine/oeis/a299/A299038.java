package irvine.oeis.a299;

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A299038 Number A(n,k) of rooted trees with n nodes where each node has at most k children; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A299038 extends UpperLeftTriangle {


  /** Construct the sequence. */
  public A299038() {
    super(0, 0, -1);
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, i, t, k) option remember; `if`(n=0, 1,
          `if`(i<1, 0, add(binomial(b((i-1)$2, k$2)+j-1, j)*
           b(n-i*j, i-1, t-j, k), j=0..min(t, n/i))))
        end:
    A:= (n, k)-> `if`(n=0, 1, b(n-1$2, k$2)):
    seq(seq(A(n, d-n), n=0..d), d=0..14);
  */
  protected final MemoryFunctionInt4<Z> mB = new MemoryFunctionInt4<Z>() {
    @Override
    protected Z compute(final int n, final int i, final int t, final int k) {
      // Protected access is needed for A299039, for example.
      if (n == 0) {
        return Z.ONE;
      }
      if (i < 1) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      final int ni = n / i;
      final int jmax = Math.min(t, ni);
      for (int j = 0; j <= jmax; ++j) {
        sum = sum.add(Binomial.binomial(get(i - 1, i - 1, k, k).add(j - 1), Z.valueOf(j)).multiply(get(n - i * j, i - 1, t - j, k)));
      }
      return sum;
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return n == 0 ? Z.ONE : mB.get(n - 1, n - 1, k, k);
  }
}
