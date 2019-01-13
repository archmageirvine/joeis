package irvine.oeis.a207;

import irvine.oeis.LinearRecurrence;

/**
 * A207075.
 * @author Sean A. Irvine
 */
public class A207075 extends LinearRecurrence {

  /** Construct the sequence. */
  public A207075() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 280, 637, 1437, 2937, 4960, 9580});
  }
}
