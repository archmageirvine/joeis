package irvine.oeis.a242;

import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A242464 Number A(n,k) of n-length words w over a k-ary alphabet {a_1,...,a_k} such that w contains never more than j consecutive letters a_j (for 1&lt;=j&lt;=k); square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A242464 extends UpperLeftTriangle {

  {
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, k, c, t) option remember;
          `if`(n=0, 1, add(`if`(c=t and j=c, 0,
           b(n-1, k, j, 1+`if`(j=c, t, 0))), j=1..k))
        end:
    A:= (n, k)-> b(n, k, 0$2):
    seq(seq(A(n, d-n), n=0..d), d=0..12);
  */
  private final MemoryFunctionInt4<Z> mB = new MemoryFunctionInt4<>() {
    @Override
    protected Z compute(final int n, final int k, final int c, final int t) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int j = 1; j <= k; ++j) {
        if (c != t || j != c) {
          sum = sum.add(get(n - 1, k, j, 1 + (j == c ? t : 0)));
        }
      }
      return sum;
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n, k, 0, 0);
  }
}
