package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119827 Number of ternary words of length n with exactly one 000.
 * @author Sean A. Irvine
 */
public class A119827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119827() {
    super(new long[] {-4, -8, -12, -4, 0, 4}, new long[] {0, 0, 0, 1, 4, 16});
  }
}
