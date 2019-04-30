package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248698 Floor of sums of the non-integer fourth roots of n, as partitioned by the integer roots: floor[sum(j from <code>n^4+1</code> to <code>(n+1)^4-1, j^(1/4))]</code>.
 * @author Sean A. Irvine
 */
public class A248698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248698() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 23, 166, 621, 1676});
  }
}
