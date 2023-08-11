package irvine.oeis.a245;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A245405 Number A(n,k) of endofunctions on [n] such that no element has a preimage of cardinality k; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A245405 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A245405() {
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, i, k) option remember; `if`(n=0 and i=0, 1,
          `if`(i<1, 0, add(`if`(j=k, 0, b(n-j, i-1, k)*
           binomial(n, j)), j=0..n)))
        end:
    A:= (n, k)-> b(n$2, k):
    seq(seq(A(n, d-n), n=0..d), d=0..14);
  */
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int i, final int k) {
      if (n == 0 && i == 0) {
        return Z.ONE;
      }
      if (i < 1) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (int j = 0; j <= n; ++j) {
        if (j != k) {
          sum = sum.add(get(n - j, i - 1, k).multiply(Binomial.binomial(n, j)));
        }
      }
      return sum;
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n, n, k);
  }
}
