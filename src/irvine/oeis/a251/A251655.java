package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251655 4-step Fibonacci sequence starting with <code>0, 1, 1, 1</code>.
 * @author Sean A. Irvine
 */
public class A251655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251655() {
    super(new long[] {1, 1, 1, 1}, new long[] {0, 1, 1, 1});
  }
}
