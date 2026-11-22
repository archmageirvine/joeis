package irvine.oeis.a347;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a001.A001865;
import irvine.oeis.triangle.Triangle;

/**
 * A347999 Triangular array read by rows: T(n,k) is the number of endofunctions f:{1,2,...,n}-&gt; {1,2,...,n} whose smallest connected component has exactly k nodes; n &gt;= 0, 0 &lt;= k &lt;= n.
 * @author Gregory Morse
 */
public class A347999 extends Triangle {
  private final A001865 mConnected = new A001865();
  private final MemoryFunctionInt3<Z> mRestricted = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int lo, final int hi) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int k = lo; k <= hi; ++k) {
        sum = sum.add(Binomial.binomial(n - 1, k - 1).multiply(mConnected.a(k)).multiply(restricted(n - k, lo, hi)));
      }
      return sum;
    }
  };

  protected final Z restricted(final int n, final int lo, final int hi) {
    return mRestricted.get(n, lo, Math.min(n, hi));
  }

  @Override
  protected Z compute(final int n, final int k) {
    if (k == 0) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    return restricted(n, k, n).subtract(restricted(n, k + 1, n));
  }
}
