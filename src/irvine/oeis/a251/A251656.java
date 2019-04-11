package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251656 4-step Fibonacci sequence starting with <code>1,0,1,0</code>.
 * @author Sean A. Irvine
 */
public class A251656 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251656() {
    super(new long[] {1, 1, 1, 1}, new long[] {1, 0, 1, 0});
  }
}
