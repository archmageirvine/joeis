package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266980.
 * @author Sean A. Irvine
 */
public class A266980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266980() {
    super(new long[] {64, 0, -84, 0, 21, 0}, new long[] {1, 6, 5, 122, 21, 2026});
  }
}
