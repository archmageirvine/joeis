package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129696 Antidiagonal sums of triangular array T defined in <code>A014430: T(j,k) = binomial(j+1, k)-1</code> for <code>1 &lt;= k &lt;=</code> j.
 * @author Sean A. Irvine
 */
public class A129696 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129696() {
    super(new long[] {1, 0, -3, 1, 2}, new long[] {1, 2, 5, 9, 17});
  }
}
