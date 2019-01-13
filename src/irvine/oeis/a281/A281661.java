package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281661.
 * @author Sean A. Irvine
 */
public class A281661 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281661() {
    super(new long[] {-1, 0, 6, 0, -15, 0, 20, 0, -15, 0, 6, 0}, new long[] {1, 2, 45, 140, 1105, 1638, 8029, 8600, 33345, 29930, 101101, 81252});
  }
}
