package irvine.oeis.a220;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A220062 Number A(n,k) of n length words over k-ary alphabet, where neighboring letters are neighbors in the alphabet; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A220062 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A220062() {
    super(0, 0, -1);
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, i, k) option remember; `if`(n=0, 1,
          `if`(i=0, add(b(n-1, j, k), j=1..k),
          `if`(i>1, b(n-1, i-1, k), 0)+
          `if`(i<k, b(n-1, i+1, k), 0)))
        end:
    A:= (n, k)-> b(n, 0, k):
    seq(seq(A(n, d-n), n=0..d), d=0..14);
  */
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<Z>() {
    @Override
    protected Z compute(final int n, final int i, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      if (i == 0) {
        for (int j = 1; j <= k; ++j) {
          sum = sum.add(get(n - 1, j, k));
        }
        return sum;
      }
      if (i > 1) {
        sum = sum.add(get(n - 1, i - 1, k));
      }
      if (i < k) {
        sum = sum.add(get(n - 1, i + 1, k));
      }
      return sum;
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n, 0, k);
  }
}
