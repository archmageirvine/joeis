package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022370 Fibonacci sequence beginning 2, 16.
 * @author Sean A. Irvine
 */
public class A022370 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022370() {
    super(new long[] {1, 1}, new long[] {2, 16});
  }
}
