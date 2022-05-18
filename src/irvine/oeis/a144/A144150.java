package irvine.oeis.a144;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A144150 Square array A(n,k), n &gt;= 0, k &gt;= 0, read by antidiagonals, where the e.g.f. of column k is 1+g^(k+1)(x) with g = x-&gt; exp(x)-1.
 * @author Georg Fischer
 */
public class A144150 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A144150() {
    super(0, 0, -1);
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, t, m) option remember; `if`(t=0, 1, `if`(n=0,
          b(m, t-1, 0), m*b(n-1, t, m)+b(n-1, t, m+1)))
        end:
    A:= (n, k)-> b(n, k, 0):
    seq(seq(A(n, d-n), n=0..d), d=0..12);
  */
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<Z>() {
    @Override
    protected Z compute(final int n, final int t, final int m) {
      if (t == 0) {
        return Z.ONE;
      }
      if (n == 0) {
        return get(m, t - 1, 0);
      }
      return get(n - 1, t, m).multiply(m).add(get(n - 1, t, m + 1));
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n, k, 0);
  }
}
