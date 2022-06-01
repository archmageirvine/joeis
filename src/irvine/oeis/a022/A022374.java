package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022374 Fibonacci sequence beginning 2, 24.
 * @author Sean A. Irvine
 */
public class A022374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022374() {
    super(new long[] {1, 1}, new long[] {2, 24});
  }
}
