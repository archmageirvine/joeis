package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074061 Positive integers k such that 24*k^2 - 23 is a square.
 * @author Sean A. Irvine
 */
public class A074061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074061() {
    super(new long[] {-1, 0, 10, 0}, new long[] {1, 4, 6, 39});
  }
}
