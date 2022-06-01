package irvine.oeis.a169;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A169599 Numbers that are congruent to {4, 23} mod 29.
 * @author Sean A. Irvine
 */
public class A169599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169599() {
    super(new long[] {-1, 1, 1}, new long[] {4, 23, 33});
  }
}
