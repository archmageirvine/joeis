package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282614 Number of inequivalent 3 X 3 matrices with entries in <code>{1,2,3,</code>..,n} up to vertical and horizontal reflections.
 * @author Sean A. Irvine
 */
public class A282614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282614() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 1, 168, 5346, 67840, 496875, 2544696, 10151428, 33693696, 97135605});
  }
}
