package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119286 Alternating sum of the fifth powers of the first n Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A119286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119286() {
    super(new long[] {-1, 9, 32, -100, 20, 48, -7}, new long[] {0, -1, 0, -32, 211, -2914, 29854});
  }
}
