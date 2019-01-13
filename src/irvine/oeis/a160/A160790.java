package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160790.
 * @author Sean A. Irvine
 */
public class A160790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160790() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 1, 2, 4, 7, 10, 16});
  }
}
