package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293612.
 * @author Sean A. Irvine
 */
public class A293612 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293612() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 26, 588, 5376, 30660, 129780, 446292, 1315776, 3444012, 8198190});
  }
}
