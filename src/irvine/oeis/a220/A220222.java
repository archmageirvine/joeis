package irvine.oeis.a220;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A220222 Triangular array read by rows. T(n,k) is the number of functional digraphs on {1,2,...,n} such that no node is at a distance greater than one from a cycle and there are k recurrent elements whose preimage contains only one element, n&gt;=0, 0&lt;=k&lt;=n.
 * @author Gregory Morse
 */
public class A220222 extends Triangle {
  private final boolean mUnbounded;

  protected A220222(final boolean unbounded) {
    mUnbounded = unbounded;
  }

  /** Construct the sequence. */
  public A220222() {
    this(false);
  }

  private Z forest(final int n, final int r) {
    if (!mUnbounded) {
      return Z.valueOf(r).pow(n);
    }
    return n == 0 ? Z.ONE : Z.valueOf(n + r).pow(n - 1).multiply(r);
  }

  @Override
  protected Z compute(final int n, final int k) {
    if (n == 0) {
      return mUnbounded ? Z.ZERO : Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int r = Math.max(1, k); r <= n; ++r) {
      final int m = r - k;
      Z count = Z.ZERO;
      for (int j = 0; j <= m; ++j) {
        count = count.signedAdd(((m - j) & 1) == 0, Binomial.binomial(m, j).multiply(forest(n - r, j)));
      }
      sum = sum.add(count.multiply(Binomial.binomial(n, r)).multiply(Binomial.binomial(r, k)).multiply(Functions.FACTORIAL.z(r)));
    }
    return sum;
  }
}
