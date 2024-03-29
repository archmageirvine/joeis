package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047552 Numbers that are congruent to {2, 6, 7} mod 8.
 * @author Sean A. Irvine
 */
public class A047552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047552() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {2, 6, 7, 10});
  }
}
