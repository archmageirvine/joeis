package irvine.oeis.a316;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A316074 Sequence a_k of column k shifts left k places under Weigh transform and equals signum(n) for n&lt;k; triangle T(n,k), n&gt;=1, 1&lt;=k&lt;=n, read by rows.
 * triangle T(n,k), n&gt;=1, 1&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A316074 extends Triangle {

  /** Construct the sequence. */
  public A316074() {
    setOffset(1);
    hasRAM(true);
  }

  /* Maple program:
    b:= proc(n, i, k) option remember; `if`(n=0, 1, `if`(i<1, 0,
      add(binomial(T(i, k), j)*b(n-i*j, i-1, k), j=0..n/i)))
    end:
    T:= (n, k)-> `if`(n<k, signum(n), b(n-k$2, k)):
    seq(seq(T(n, k), k=1..n), n=1..16);
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
      Z sum = Z.ZERO;
      final int jmax = n / i;
      for (int j = 0; j <= jmax; ++j) {
        sum = sum.add(Binomial.binomial(i < k ? Z.valueOf(Integer.signum(i)) : mB.get(i - k, i - k, k), Z.valueOf(j))
          .multiply(get(n - i * j, i - 1, k)));
      }
      return sum;
    }
  };

  @Override
  protected Z compute(int n, int k) {
    ++n;
    ++k;
    return n < k ? Z.valueOf(Integer.signum(n)) : mB.get(n - k, n - k, k);
  }
}
