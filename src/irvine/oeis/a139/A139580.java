package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139580.
 * @author Sean A. Irvine
 */
public class A139580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139580() {
    super(new long[] {1, -3, 3}, new long[] {0, 19, 42});
  }
}
