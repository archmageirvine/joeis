package irvine.oeis.a251;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A251655 4-step Fibonacci sequence starting with 0, 1, 1, 1.
 * @author Sean A. Irvine
 */
public class A251655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251655() {
    super(new long[] {1, 1, 1, 1}, new long[] {0, 1, 1, 1});
  }
}
