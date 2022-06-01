package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131805 Row sums of triangular array T: T(j,k) = -(k+1)/2 for odd k, T(j,k) = 0 for k = 0, T(j,k) = j+1-k/2 for even k &gt; 0; 0 &lt;= k &lt;= j.
 * @author Sean A. Irvine
 */
public class A131805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131805() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, -1, 1, 0, 4});
  }
}
