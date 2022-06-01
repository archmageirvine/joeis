package irvine.oeis.a191;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A191902 Number of compositions of odd positive integers into 5 parts &lt;= n.
 * @author Sean A. Irvine
 */
public class A191902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191902() {
    super(new long[] {-1, 5, -9, 5, 5, -9, 5}, new long[] {0, 16, 121, 512, 1562, 3888, 8403});
  }
}
