package irvine.oeis.a255;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A255212 Number A(n,k) of partitions of n^2 into at most k square parts; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A255212 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A255212() {
    super(0, 0, -1);
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, i, t) option remember; `if`(n=0 or i=1 and n<=t, 1,
          (j-> `if`(t*j<n, 0, b(n, i-1, t)+
               `if`(j>n, 0, b(n-j, i, t-1))))(i^2))
        end:
    A:= (n, k)-> b(n^2, n, k):
    seq(seq(A(n, d-n), n=0..d), d=0..15);
  */
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<Z>() {
    @Override
    protected Z compute(final int n, final int i, final int t) {
      if (n == 0 || i == 1 && n <= t) {
        return Z.ONE;
      }
      final int j = i * i;
      if (t * j < n) {
        return Z.ZERO;
      }
      Z sum = get(n, i - 1, t);
      if (j <= n) {
        sum = sum.add(get(n - j, i, t - 1));
      }
      return sum;
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n * n, n, k);
  }
}
