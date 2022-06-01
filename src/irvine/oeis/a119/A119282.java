package irvine.oeis.a119;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A119282 Alternating sum of the first n Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A119282 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119282() {
    super(new long[] {-1, 2, 0}, new long[] {0, -1, 0});
  }
}
