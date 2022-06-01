package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022116 Fibonacci sequence beginning 2, 13.
 * @author Sean A. Irvine
 */
public class A022116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022116() {
    super(new long[] {1, 1}, new long[] {2, 13});
  }
}
