package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022368 Fibonacci sequence beginning 2, 12.
 * @author Sean A. Irvine
 */
public class A022368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022368() {
    super(new long[] {1, 1}, new long[] {2, 12});
  }
}
