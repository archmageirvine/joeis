package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105755.
 * @author Sean A. Irvine
 */
public class A105755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105755() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {1, 3, 7, 15, 31, 63, 127, 255, 511});
  }
}
