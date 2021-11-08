package irvine.oeis.a131;
// generated fract22 at 2021-10-28 22:07

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A131830 Triangle read by rows: T(n,0) = T(n,n) = n + 1 for n &gt;= 0, and T(n,k) = binomial(n,k) for 1 &lt;= k &lt;= n - 1, n &gt;= 2.
 *
 * @author Georg Fischer
 */
public class A131830 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A131830() {
    super(0, new long[] {1, -1, -1, 0, -2, 0, 0, 3, 3, 0, 0, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, -3, -3, 3, 8, 3, -1, -7, -7, -1, 0, 2, 5, 2, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
