package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022388 Fibonacci sequence beginning 6, 13.
 * @author Sean A. Irvine
 */
public class A022388 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022388() {
    super(new long[] {1, 1}, new long[] {6, 13});
  }
}
