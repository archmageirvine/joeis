package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022100 Fibonacci sequence beginning 1, 10.
 * @author Sean A. Irvine
 */
public class A022100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022100() {
    super(new long[] {1, 1}, new long[] {1, 10});
  }
}
