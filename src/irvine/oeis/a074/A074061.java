package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074061 Positive integers n such that 24*n^2-23 is a square.
 * @author Sean A. Irvine
 */
public class A074061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074061() {
    super(new long[] {-1, 0, 10, 0}, new long[] {1, 4, 6, 39});
  }
}
