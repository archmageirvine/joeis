package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022138 Fibonacci sequence beginning 5, 13.
 * @author Sean A. Irvine
 */
public class A022138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022138() {
    super(new long[] {1, 1}, new long[] {5, 13});
  }
}
