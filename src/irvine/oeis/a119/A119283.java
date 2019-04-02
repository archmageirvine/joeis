package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119283 Alternating sum of the squares of the first n Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A119283 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119283() {
    super(new long[] {-1, -1, 4, -1}, new long[] {0, -1, 0, -4});
  }
}
