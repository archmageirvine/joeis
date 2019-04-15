package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179006 Partial sums of <code>floor(Fibonacci(n)/4)</code>.
 * @author Sean A. Irvine
 */
public class A179006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179006() {
    super(new long[] {1, -1, -1, 2, -2, 2, -3, 3}, new long[] {0, 0, 0, 0, 0, 1, 3, 6});
  }
}
