package irvine.oeis.a080;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A080937 Number of Catalan paths (nonnegative, starting and ending at 0, step +/-1) of 2*n steps with all values &lt;= 5.
 * @author Sean A. Irvine
 */
public class A080937 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080937() {
    super(new long[] {1, -6, 5}, new long[] {1, 1, 2});
  }
}
