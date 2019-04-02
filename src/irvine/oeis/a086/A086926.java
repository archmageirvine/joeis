package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086926 Product of Fibonacci and (shifted) triangular numbers.
 * @author Sean A. Irvine
 */
public class A086926 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086926() {
    super(new long[] {1, 3, 0, -5, 0, 3}, new long[] {0, 0, 1, 6, 18, 50});
  }
}
