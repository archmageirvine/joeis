package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022114 Fibonacci sequence beginning 2 9.
 * @author Sean A. Irvine
 */
public class A022114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022114() {
    super(new long[] {1, 1}, new long[] {2, 9});
  }
}
