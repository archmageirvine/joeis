package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041132.
 * @author Sean A. Irvine
 */
public class A041132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041132() {
    super(new long[] {-1, 0, 0, 0, 52, 0, 0, 0}, new long[] {8, 9, 17, 26, 433, 459, 892, 1351});
  }
}
