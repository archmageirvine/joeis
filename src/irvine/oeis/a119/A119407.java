package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119407.
 * @author Sean A. Irvine
 */
public class A119407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119407() {
    super(new long[] {1, -1, 0, 0, -2, 3}, new long[] {1, 3, 7, 15, 31, 62});
  }
}
