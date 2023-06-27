package irvine.oeis.a181;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A181106 Largest odd number strictly less than a square.
 * @author Sean A. Irvine
 */
public class A181106 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181106() {
    super(1, new long[] {1, -2, 0, 2}, new long[] {-1, 3, 7, 15});
  }
}
