package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022132 Fibonacci sequence beginning 4, 13.
 * @author Sean A. Irvine
 */
public class A022132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022132() {
    super(new long[] {1, 1}, new long[] {4, 13});
  }
}
