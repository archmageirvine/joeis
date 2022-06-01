package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022124 Fibonacci sequence beginning 3, 13.
 * @author Sean A. Irvine
 */
public class A022124 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022124() {
    super(new long[] {1, 1}, new long[] {3, 13});
  }
}
