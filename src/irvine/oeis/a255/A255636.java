package irvine.oeis.a255;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A255636 Number A(n,k) of n-node rooted trees with a forbidden limb of length k; square array A(n,k), n&gt;=1, k&gt;=1, read by antidiagonals.
 * @author Georg Fischer
 */
public class A255636 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A255636() {
    super(1, 1, -1);
    hasRAM(true);
  }

  /* Maple:
    with(numtheory):
    g:= proc(n, k) option remember; `if`(n=0, 1, add(add(d*(g(d-1, k)-
          `if`(d=k, 1, 0)), d=divisors(j))*g(n-j, k), j=1..n)/n)
        end:
    A:= (n, k)-> g(n-1, k):
    seq(seq(A(n, 1+d-n), n=1..d), d=1..14);
  */
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int j = 1; j <= n; ++j) {
        sum = sum.add(Integers.SINGLETON.sumdiv(j, d -> get(d - 1, k).subtract(d == k ? Z.ONE : Z.ZERO).multiply(d)).multiply(get(n - j, k)));
      }
      return sum.divide(n);
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n - 1, k);
  }
}
