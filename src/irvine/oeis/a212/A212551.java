package irvine.oeis.a212;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A212551 Number of partitions T(n,k) of n containing at least one other part m-k if m is the largest part; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A212551 extends BaseTriangle {

  /** Construct the sequence. */
  public A212551() {
    super();
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, i) option remember;
          `if`(n=0 or i=1, 1, b(n, i-1)+`if`(i>n, 0, b(n-i, i)))
        end:
    T:= (n, k)-> `if`(n=0 and k=0, 1,
        add(b(n-2*m-k, min(n-2*m-k, m+k)), m=1..(n-k)/2)):
    seq(seq(T(n, k), k=0..n), n=0..14);
  */
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int i) {
      if (n == 0 || i == 1) {
        return Z.ONE;
      }
      return (i > n) ? get(n, i - 1) : get(n, i - 1).add(get(n - i, i));
    }
  };

  @Override
  public Z triangleElement(final int n, final int k) {
    if (n == 0 && k == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final int mmax = (n - k) / 2;
    for (int m = 1; m <= mmax; ++m) {
      final int n2mk = n - 2 * m - k;
      sum = sum.add(mB.get(n2mk, n2mk < m + k ? n2mk : m + k));
    }
    return sum;
  }
}
