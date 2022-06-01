package irvine.oeis.a251;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A251749 9-step Fibonacci sequence starting with 0,0,0,0,1,0,0,0,0.
 * @author Sean A. Irvine
 */
public class A251749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251749() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {0, 0, 0, 0, 1, 0, 0, 0, 0});
  }
}
