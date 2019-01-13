package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119610.
 * @author Sean A. Irvine
 */
public class A119610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119610() {
    super(new long[] {-2, 1, 0, 0, 0, 2}, new long[] {1, 2, 4, 8, 16, 33});
  }
}
