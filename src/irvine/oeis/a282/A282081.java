package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282081.
 * @author Sean A. Irvine
 */
public class A282081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282081() {
    super(new long[] {-1, 6, -18, 38, -63, 84, -92, 84, -63, 38, -18, 6}, new long[] {1, 3, 9, 28, 66, 126, 226, 396, 651, 1001, 1491, 2184});
  }
}
