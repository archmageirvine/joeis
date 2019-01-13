package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214297.
 * @author Sean A. Irvine
 */
public class A214297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214297() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {-1, 0, -3, 2, 3, 6});
  }
}
