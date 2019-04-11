package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054622 Number of ways to color vertices of <code>an</code> octagon using <code>&lt;= n</code> colors, allowing only rotations.
 * @author Sean A. Irvine
 */
public class A054622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054622() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 1, 36, 834, 8230, 48915, 210126, 720916, 2097684});
  }
}
