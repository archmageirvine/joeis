package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037702.
 * @author Sean A. Irvine
 */
public class A037702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037702() {
    super(new long[] {-4, 1, 0, 0, 4}, new long[] {1, 7, 28, 114, 457});
  }
}
