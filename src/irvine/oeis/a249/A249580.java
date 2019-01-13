package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249580.
 * @author Sean A. Irvine
 */
public class A249580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249580() {
    super(new long[] {1, 0, 0, 0, -3, 0, 0, 0}, new long[] {3, -1, -2, 1, -9, 4, 7, -3});
  }
}
