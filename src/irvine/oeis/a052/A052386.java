package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052386 Number of integers from 1 to 10^n-1 that lack 0 as a digit.
 * @author Sean A. Irvine
 */
public class A052386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052386() {
    super(new long[] {-9, 10}, new long[] {0, 9});
  }
}
