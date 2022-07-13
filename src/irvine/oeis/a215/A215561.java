package irvine.oeis.a215;

import irvine.math.z.Z;
import irvine.oeis.a147.A147682;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A215561 Number A(n,k) of permutations of k indistinguishable copies of 1..n with every partial sum &lt;= the same partial sum averaged over all permutations; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A215561 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A215561() {
    super(0, 0, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    final int[] list = new int[n + 1];
    list[0] = 0;
    for (int i = 1; i <= n; ++i) {
      list[i] = k;
    }
    return A147682.B.get(list);
  }
}
