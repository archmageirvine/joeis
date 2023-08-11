package irvine.oeis.a246;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A246935 Number A(n,k) of partitions of n into k sorts of parts; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A246935 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A246935() {
    super(0, 0, -1);
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, i, k) option remember; `if`(n=0, 1, `if`(i<1, 0,
          b(n, i-1, k) +`if`(i>n, 0, k*b(n-i, i, k))))
        end:
    A:= (n, k)-> b(n$2, k):
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
      Z sum = get(n, i - 1, k);
      if (i <= n) {
        sum = sum.add(get(n - i, i, k).multiply(k));
      }
      return sum;
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n, n, k);
  }
}
