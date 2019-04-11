package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251744 8-step Fibonacci sequence starting with <code>0,0,1,0,0,0,0,0</code>.
 * @author Sean A. Irvine
 */
public class A251744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251744() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1}, new long[] {0, 0, 1, 0, 0, 0, 0, 0});
  }
}
