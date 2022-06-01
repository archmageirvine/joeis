package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022097 Fibonacci sequence beginning 1, 7.
 * @author Sean A. Irvine
 */
public class A022097 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022097() {
    super(new long[] {1, 1}, new long[] {1, 7});
  }
}
