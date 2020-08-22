package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160791 First differences of A160790.
 * @author Sean A. Irvine
 */
public class A160791 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160791() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {1, 1, 2, 3, 3, 6});
  }
}
