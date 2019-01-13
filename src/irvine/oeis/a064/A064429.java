package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064429.
 * @author Sean A. Irvine
 */
public class A064429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064429() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 2, 1, 3});
  }
}
