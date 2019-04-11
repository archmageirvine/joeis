package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060561 Number of ways to color vertices of a 9-gon using <code>&lt;= n</code> colors, allowing rotations and reflections.
 * @author Sean A. Irvine
 */
public class A060561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060561() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 1, 46, 1219, 15084, 110085, 563786, 2250311, 7472984, 21552969});
  }
}
