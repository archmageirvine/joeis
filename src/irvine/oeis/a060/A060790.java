package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060790 Inscribe two circles of curvature 2 inside a circle of curvature -1. Sequence gives curvatures of the smallest circles that can be sequentially inscribed in such a diagram.
 * @author Sean A. Irvine
 */
public class A060790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060790() {
    super(new long[] {-1, 2, 2, 2}, new long[] {-1, 2, 2, 3});
  }
}
