package irvine.oeis.a215;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A215861 Number T(n,k) of simple labeled graphs on n nodes with exactly k connected components that are trees or cycles; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A215861 extends Triangle {

  /** Construct the sequence. */
  public A215861() {
    super(0, 1, -1);
    hasRAM(true);
  }

  /* Maple:
    T:= proc(n, k) option remember; `if`(k<0 or k>n, 0,
          `if`(n=0, 1, add(binomial(n-1, i)*T(n-1-i, k-1)*
          `if`(i<2, 1, i!/2 +(i+1)^(i-1)), i=0..n-k)))
        end:
    seq(seq(T(n, k), k=0..n), n=0..12);
  */
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (k < 0 || k > n) {
        return Z.ZERO;
      }
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      final int imax = n - k;
      for (int i = 0; i <= imax; ++i) {
        Z term = get(n - 1 - i, k - 1).multiply(Binomial.binomial(n - 1, i));
        if (i >= 2) {
          term = term.multiply(Functions.FACTORIAL.z(i).divide2().add(Z.valueOf(i + 1).pow(i - 1)));
        }
        sum = sum.add(term);
      }
      return sum;
    }
  };

  @Override
  protected Z compute(final int n, final int k) {
    return mB.get(n, k);
  }
}
