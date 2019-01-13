package irvine.oeis.a278;

import irvine.oeis.LinearRecurrence;

/**
 * A278580.
 * @author Sean A. Irvine
 */
public class A278580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278580() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 3, 4, 6, 8, 9, 12, 13, 16, 18, 24});
  }
}
