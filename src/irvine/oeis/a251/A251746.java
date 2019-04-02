package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251746 9-step Fibonacci sequence starting with 0,0,0,0,0,0,0,1,0.
 * @author Sean A. Irvine
 */
public class A251746 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251746() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {0, 0, 0, 0, 0, 0, 0, 1, 0});
  }
}
