package irvine.oeis.a224;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A224336 Number of idempotent 5X5 0..n matrices of rank 4.
 * @author Sean A. Irvine
 */
public class A224336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224336() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {155, 805, 2555, 6245, 12955});
  }
}
