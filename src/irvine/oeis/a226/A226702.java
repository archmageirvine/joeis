package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226702.
 * @author Sean A. Irvine
 */
public class A226702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226702() {
    super(new long[] {-1, 1523}, new long[] {1, 1522});
  }
}
