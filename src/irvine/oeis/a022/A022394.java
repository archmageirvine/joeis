package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022394 Fibonacci sequence beginning 1, 24.
 * @author Sean A. Irvine
 */
public class A022394 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022394() {
    super(new long[] {1, 1}, new long[] {1, 24});
  }
}
