package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022099 Fibonacci sequence beginning 1, 9.
 * @author Sean A. Irvine
 */
public class A022099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022099() {
    super(new long[] {1, 1}, new long[] {1, 9});
  }
}
