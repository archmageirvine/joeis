package irvine.oeis.a263;

import irvine.oeis.LinearRecurrence;

/**
 * A263694.
 * @author Sean A. Irvine
 */
public class A263694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263694() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 3, 4, 8, 7, 6, 5, 9});
  }
}
