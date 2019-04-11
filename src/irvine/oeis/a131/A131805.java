package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131805 Row sums of triangular array T: T(j,k) <code>= -(k+1)/2</code> for odd <code>k,</code> T(j,k) <code>= 0</code> for <code>k = 0,</code> T(j,k) <code>= j+1-k/2</code> for even <code>k &gt; 0</code>; <code>0 &lt;= k &lt;= j</code>.
 * @author Sean A. Irvine
 */
public class A131805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131805() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, -1, 1, 0, 4});
  }
}
