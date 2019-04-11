package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251705 4-step Fibonacci sequence starting with <code>1, 1, 1, 0</code>.
 * @author Sean A. Irvine
 */
public class A251705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251705() {
    super(new long[] {1, 1, 1, 1}, new long[] {1, 1, 1, 0});
  }
}
