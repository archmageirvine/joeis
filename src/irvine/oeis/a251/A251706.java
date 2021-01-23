package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251706 6-step Fibonacci sequence starting with (0,0,0,0,1,0).
 * @author Sean A. Irvine
 */
public class A251706 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251706() {
    super(new long[] {1, 1, 1, 1, 1, 1}, new long[] {0, 0, 0, 0, 1, 0});
  }
}
