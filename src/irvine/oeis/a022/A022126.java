package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022126 Fibonacci sequence beginning 3, 16.
 * @author Sean A. Irvine
 */
public class A022126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022126() {
    super(new long[] {1, 1}, new long[] {3, 16});
  }
}
