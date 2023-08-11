package irvine.oeis.a239;

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A239550 Number A(n,k) of compositions of n such that the first part is 1 and the second differences of the parts are in {-k,...,k}; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A239550 extends UpperLeftTriangle {

  {
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, i, j, k) option remember; `if`(n=0, 1,
          `if`(i=0, add(b(n-h, j, h, k), h=1..n), add(
           b(n-h, j, h, k), h=max(1, 2*j-i-k)..min(n, 2*j-i+k))))
        end:
    A:= (n, k)-> `if`(n=0, 1, b(n-1, 0, 1, k)):
    seq(seq(A(n, d-n), n=0..d), d=0..12);
  */
  private final MemoryFunctionInt4<Z> mB = new MemoryFunctionInt4<>() {
    @Override
    protected Z compute(final int n, final int i, final int j, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      if (i == 0) {
        for (int h = 1; h <= n; ++h) {
          sum = sum.add(get(n - h, j, h, k));
        }
        return sum;
      }
      final int jikp2 = 2 * j - i + k;
      final int hmax = n < jikp2 ? n : jikp2;
      final int jikm2 = 2 * j - i - k;
      final int hmin = 1 > jikm2 ? 1 : jikm2;
      for (int h = hmin; h <= hmax; ++h) {
        sum = sum.add(get(n - h, j, h, k));
      }
      return sum;
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    if (n == 0) {
      return Z.ONE;
    }
    return mB.get(n - 1, 0, 1, k);
  }
}
