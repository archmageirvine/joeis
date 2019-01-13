package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177239.
 * @author Sean A. Irvine
 */
public class A177239 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177239() {
    super(new long[] {-1, 2, 0, -2, 1, 1, -2, 0, 2}, new long[] {0, 0, 0, 0, 1, 2, 4, 6, 9});
  }
}
