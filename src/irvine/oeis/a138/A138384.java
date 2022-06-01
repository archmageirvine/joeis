package irvine.oeis.a138;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A138384 Reverse groups of five Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A138384 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138384() {
    super(new long[] {1, 0, 0, 0, 0, 11, 0, 0, 0, 0}, new long[] {3, 2, 1, 1, 0, 34, 21, 13, 8, 5});
  }
}
