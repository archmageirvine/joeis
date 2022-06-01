package irvine.oeis.a210;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A210427 Number of semistandard Young tableaux over all partitions of 5 with maximal element &lt;= n.
 * @author Sean A. Irvine
 */
public class A210427 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210427() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 12, 69, 260, 751});
  }
}
