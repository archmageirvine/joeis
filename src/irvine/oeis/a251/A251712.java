package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251712 7-step Fibonacci sequence starting with <code>(0,0,0,1,0,0,0)</code>.
 * @author Sean A. Irvine
 */
public class A251712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251712() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1}, new long[] {0, 0, 0, 1, 0, 0, 0});
  }
}
