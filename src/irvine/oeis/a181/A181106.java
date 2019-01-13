package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181106.
 * @author Sean A. Irvine
 */
public class A181106 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181106() {
    super(new long[] {1, -2, 0, 2}, new long[] {-1, 3, 7, 15});
  }
}
