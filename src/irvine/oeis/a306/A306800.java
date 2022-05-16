package irvine.oeis.a306;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A306800 Square array whose entry A(n,k) is the number of endofunctions on a set of size n with preimage constraint {0,1,...,k}, for n &gt;= 0, k &gt;= 0, read by descending antidiagonals.
 * @author Georg Fischer
 */
public class A306800 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A306800() {
    super(0, 0, -1);
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, i, k) option remember; `if`(n=0 and i=0, 1, `if`(i<1, 0,
          add(b(n-j, i-1, k)*binomial(n, j), j=0..min(k, n))))
        end:
    A:= (n, k)-> b(n$2, k):
    seq(seq(A(n, d-n), n=0..d), d=0..12);  # _Alois P. Heinz_, Apr 05 2019
  */
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<Z>() {
    @Override
    protected Z compute(final int n, final int i, final int k) {
      if (n == 0 && i == 0) {
        return Z.ONE;
      }
      if (i < 1) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      final int jmax = k < n ? k : n;
      for (int j = 0; j <= jmax; ++j) {
        sum = sum.add(get(n - j, i - 1, k).multiply(Binomial.binomial(n, j)));
      }
      return sum;
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n, n, k);
  }
}
