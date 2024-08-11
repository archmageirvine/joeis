package irvine.oeis.a214;

import irvine.math.MemoryFunctionInt2;
import irvine.math.MemoryFunctionInt5;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A214269 Number T(n,k) of compositions of n where the difference between largest and smallest parts equals k and adjacent parts are unequal; triangle T(n,k), n&gt;=1, 0&lt;=k&lt;n, read by rows.
 * @author Georg Fischer
 */
public class A214269 extends Triangle {

  /** Construct the sequence. */
  public A214269() {
    super(1);
    setOffset(1);
    hasRAM(true);
  }

  private static final MemoryFunctionInt5<Z> B = new MemoryFunctionInt5<>() {
    @Override
    protected Z compute(final int n, final int k, final int s, final int t, final int l) {
      if (n < 0) {
        return Z.ZERO;
      }
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      final int jmax = s + k - 1;
      for (int j = Math.max(1, t - k + 1); j <= jmax; ++j) {
        if (j != l) {
          sum = sum.add(get(n - j, k, Math.min(s, j), Math.max(t, j), j));
        }
      }
      return sum;
    }
  };

  protected static final MemoryFunctionInt2<Z> A = new MemoryFunctionInt2<>() { // used in A214268
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int j = 1; j <= n; ++j) {
        sum = sum.add(B.get(n - j, k + 1, j, j, j));
      }
      return sum;
    }
  };

  @Override
  protected Z compute(int n, final int k) {
    ++n;
    Z result = A.get(n, k);
    if (k != 0) {
      result = result.subtract(A.get(n, k - 1));
    }
    return result;
  }
}
