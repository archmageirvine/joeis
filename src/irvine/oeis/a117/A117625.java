package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117625 Maximum number of regions defined by n zigzag-lines in the plane when a zigzag-line is defined as consisting of two parallel infinite half-lines joined by a straight line segment.
 * @author Sean A. Irvine
 */
public class A117625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117625() {
    super(new long[] {1, -3, 3}, new long[] {1, 2, 12});
  }
}
