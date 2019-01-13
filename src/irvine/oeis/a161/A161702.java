package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161702.
 * @author Sean A. Irvine
 */
public class A161702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161702() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 2, 7, 14});
  }
}
