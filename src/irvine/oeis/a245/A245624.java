package irvine.oeis.a245;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A245624 Sequence of distinct least positive numbers such that the average of the first n terms is a cube.
 * @author Sean A. Irvine
 */
public class A245624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245624() {
    super(new long[] {-1, 0, 4, 0, -6, 0, 4, 0}, new long[] {1, 15, 8, 84, 27, 249, 64, 552});
  }
}
