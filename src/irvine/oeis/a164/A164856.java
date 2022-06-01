package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164856 Row sums of generalized Lucas-Pascal triangle: A164855.
 * @author Sean A. Irvine
 */
public class A164856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164856() {
    super(new long[] {-100, -100, 101, 1}, new long[] {1, 102, 103, 10204});
  }
}
