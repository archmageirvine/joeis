package irvine.oeis.a251;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A251704 4-step Fibonacci sequence starting with 1, 1, 0, 1.
 * @author Sean A. Irvine
 */
public class A251704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251704() {
    super(new long[] {1, 1, 1, 1}, new long[] {1, 1, 0, 1});
  }
}
