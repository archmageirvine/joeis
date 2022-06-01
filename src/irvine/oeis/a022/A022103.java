package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022103 Fibonacci sequence beginning 1, 13.
 * @author Sean A. Irvine
 */
public class A022103 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022103() {
    super(new long[] {1, 1}, new long[] {1, 13});
  }
}
