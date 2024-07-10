package irvine.oeis.a046;
// manually 2024-07-09

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.DirectArray;
import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A046854 Triangle T(n, k) = binomial(floor((n+k)/2), k), n&gt;=0, n &gt;= k &gt;= 0.
 * @author Georg Fischer
 */
public class A046854 extends GeneratingFunctionTriangle implements DirectArray {

  /** Construct the sequence. */
  public A046854() {
    super(0, new long[] {1, 1, 0}, new long[] {1, 0, -1, -1, 0, 0});
  }

  @Override
  public Z a(final int n, final int k) {
    if (n < 0 || k < 0 || k > n) {
      return Z.ZERO;
    }
    return Binomial.binomial((n + k) / 2, k);
  }

}
