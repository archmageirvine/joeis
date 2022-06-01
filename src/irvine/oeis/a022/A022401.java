package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022401 Fibonacci sequence beginning 1, 31.
 * @author Sean A. Irvine
 */
public class A022401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022401() {
    super(new long[] {1, 1}, new long[] {1, 31});
  }
}
