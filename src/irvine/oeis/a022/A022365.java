package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022365 Fibonacci sequence beginning 0, 31.
 * @author Sean A. Irvine
 */
public class A022365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022365() {
    super(new long[] {1, 1}, new long[] {0, 31});
  }
}
