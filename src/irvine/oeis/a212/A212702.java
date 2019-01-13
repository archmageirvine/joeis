package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212702.
 * @author Sean A. Irvine
 */
public class A212702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212702() {
    super(new long[] {-64, 16}, new long[] {7, 112});
  }
}
