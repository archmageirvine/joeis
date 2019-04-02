package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206564 Fibonacci sequence beginning 14, 13.
 * @author Sean A. Irvine
 */
public class A206564 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206564() {
    super(new long[] {1, 1}, new long[] {14, 13});
  }
}
