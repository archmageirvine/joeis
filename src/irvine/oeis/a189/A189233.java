package irvine.oeis.a189;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A189233 Square array A(n,k), n &gt;= 0, k &gt;= 0, read by antidiagonals upwards, where the e.g.f. of column k is exp(k*(e^x-1)).
 * @author Georg Fischer
 */
public class A189233 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A189233() {
    super(0, 0, 1);
    hasRAM(true);
  }

  /* Maple:
    A:= proc(n, k) option remember; `if`(n=0, 1,
          (1+add(binomial(n-1, j-1)*A(n-j, k), j=1..n-1))*k)
        end:
    seq(seq(A(d-k, k), k=0..d), d=0..12);  # _Alois P. Heinz_, Sep 25 2017
  */
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ONE;
      for (int j = 1; j < n; ++j) {
        sum = sum.add(get(n - j, k).multiply(Binomial.binomial(n - 1, j - 1)));
      }
      return sum.multiply(k);
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n, k);
  }
}
