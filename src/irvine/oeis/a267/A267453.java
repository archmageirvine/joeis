package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267453.
 * @author Sean A. Irvine
 */
public class A267453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267453() {
    super(new long[] {-1, 0, 0, 1, 1, 0, 0}, new long[] {0, 2, 3, 5, 5, 8, 7});
  }
}
