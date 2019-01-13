package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181099.
 * @author Sean A. Irvine
 */
public class A181099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181099() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 3, 6, 1, 4, 7, 2, 5, 8, 9});
  }
}
