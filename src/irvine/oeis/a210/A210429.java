package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210429 Number of semistandard Young tableaux over all partitions of 7 with maximal element &lt;= n.
 * @author Sean A. Irvine
 */
public class A210429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210429() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 1, 20, 189, 1100, 4615, 15372, 43219});
  }
}
