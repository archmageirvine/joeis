package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287898 Number of ways to go up and down n stairs, with fewer than 4 stairs at a time, stepping on each stair at least once.
 * @author Sean A. Irvine
 */
public class A287898 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287898() {
    super(new long[] {1, 2, 2, 2}, new long[] {1, 3, 9, 27});
  }
}
