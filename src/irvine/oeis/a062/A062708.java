package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062708.
 * @author Sean A. Irvine
 */
public class A062708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062708() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 13});
  }
}
