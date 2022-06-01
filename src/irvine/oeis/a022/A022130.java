package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022130 Fibonacci sequence beginning 4,9.
 * @author Sean A. Irvine
 */
public class A022130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022130() {
    super(new long[] {1, 1}, new long[] {4, 9});
  }
}
