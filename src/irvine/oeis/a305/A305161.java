package irvine.oeis.a305;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A305161 Number A(n,k) of compositions of n into exactly n nonnegative parts &lt;= k; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A305161 extends UpperLeftTriangle {

  /* Maple:
    b:= proc(n, i, k) option remember; `if`(n=0, 1,
          `if`(i=0, 0, add(b(n-j, i-1, k), j=0..min(n, k))))
        end:
    A:= (n, k)-> b(n$2, k):
    seq(seq(A(n, d-n), n=0..d), d=0..12);
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
      final int maxj = n < k ? n : k;
      for (int j = 0; j <= maxj; ++j) {
        sum = sum.add(get(n - j, i - 1, k));
      }
      return sum;
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n, n, k);
  }
}
