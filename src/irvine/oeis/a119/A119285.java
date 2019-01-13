package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119285.
 * @author Sean A. Irvine
 */
public class A119285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119285() {
    super(new long[] {-1, -5, 15, 15, -5}, new long[] {0, -1, 0, -16, 65});
  }
}
