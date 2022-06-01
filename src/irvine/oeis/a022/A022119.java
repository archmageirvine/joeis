package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022119 Fibonacci sequence beginning 2, 19.
 * @author Sean A. Irvine
 */
public class A022119 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022119() {
    super(new long[] {1, 1}, new long[] {2, 19});
  }
}
