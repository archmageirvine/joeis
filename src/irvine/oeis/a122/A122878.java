package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122878 Periodic sequence of period 21 related to a simple scheduling problem.
 * @author Sean A. Irvine
 */
public class A122878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122878() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 1, -1, 0, 0, 0, 0, 0, 1}, new long[] {12, 12, 12, 12, 13, 13, 13, 23, 23, 23, 23, 12, 12, 12, 13});
  }
}
