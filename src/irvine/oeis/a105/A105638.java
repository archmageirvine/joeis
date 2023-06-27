package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105638 Maximum number of intersections in self-intersecting n-gon.
 * @author Sean A. Irvine
 */
public class A105638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105638() {
    super(3, new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 5, 7, 14});
  }
}
