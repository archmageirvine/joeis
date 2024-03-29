package irvine.oeis.a232;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A232567 Number of non-equivalent binary n X n matrices with two nonadjacent 1's.
 * @author Sean A. Irvine
 */
public class A232567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232567() {
    super(1, new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 1, 6, 17, 43, 84, 159, 262});
  }
}
