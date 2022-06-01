package irvine.oeis.a119;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A119852 Number of ternary words with exactly one 012.
 * @author Sean A. Irvine
 */
public class A119852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119852() {
    super(new long[] {-1, 0, 6, -2, -9, 6}, new long[] {0, 0, 0, 1, 6, 27});
  }
}
