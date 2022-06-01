package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022375 Fibonacci sequence beginning 2, 26.
 * @author Sean A. Irvine
 */
public class A022375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022375() {
    super(new long[] {1, 1}, new long[] {2, 26});
  }
}
