package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053599 Number of nonempty subsequences {s(k)} of 1..n such that the difference sequence is palindromic.
 * @author Sean A. Irvine
 */
public class A053599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053599() {
    super(new long[] {2, -4, 1, 2}, new long[] {1, 3, 7, 13});
  }
}
