package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251741 8-step Fibonacci sequence starting with <code>0,0,0,0,1,0,0,0</code>.
 * @author Sean A. Irvine
 */
public class A251741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251741() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1}, new long[] {0, 0, 0, 0, 1, 0, 0, 0});
  }
}
