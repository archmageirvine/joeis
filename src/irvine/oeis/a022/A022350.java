package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022350 Fibonacci sequence beginning 0, 16.
 * @author Sean A. Irvine
 */
public class A022350 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022350() {
    super(new long[] {1, 1}, new long[] {0, 16});
  }
}
