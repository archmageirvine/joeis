package irvine.oeis.a288;

import irvine.math.MemoryFunctionInt2;
import irvine.math.MemoryFunctionInt4;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A288972 Number A(n,k) of Dyck paths having exactly k peaks in each of the levels 1,...,n and no other peaks; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A288972 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A288972() {
    super(0, 0, -1);
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, k, j, v) option remember; `if`(n=j, `if`(v=1, 1, 0),
      `if`(v<2, 0, add(b(n-j, k, i, v-1)*(binomial(i, k)*
       binomial(j-1, i-1-k)), i=1..min(j+k, n-j))))
    end:
    A:= proc(n, k) option remember; `if`(n=0 or k=0, 1,
      add(b(w, k, k, n), w=k*n+n-1..k*n*(n+1)/2))
    end:
    seq(seq(A(n, d-n), n=0..d), d=0..10);
  */
  private final MemoryFunctionInt4<Z> mB = new MemoryFunctionInt4<Z>() {
    @Override
    protected Z compute(final int n, final int k, final int j, final int v) {
      if (n == j) {
        return v == 1 ? Z.ONE : Z.ZERO;
      }
      if (v < 2) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      final int imax = j + k < n - j ? j + k : n - j;
      for (int i = 1; i <= imax; ++i) {
        sum = sum.add(get(n - j, k, i, v - 1).multiply(Binomial.binomial(i, k)).multiply(Binomial.binomial(j - 1, i - 1 - k)));
      }
      return sum;
    }
  };

  private final MemoryFunctionInt2<Z> mA = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 0 || k == 0) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(k * n + n - 1, k * n * (n + 1) / 2, w -> mB.get(w, k, k, n));
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mA.get(n, k);
  }
}
