package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211630.
 * @author Sean A. Irvine
 */
public class A211630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211630() {
    super(new long[] {-1, 3, -3, 1, 0, 1, -3, 3}, new long[] {0, 4, 32, 106, 252, 495, 855, 1359});
  }
}
