package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008613.
 * @author Sean A. Irvine
 */
public class A008613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008613() {
    super(new long[] {1, 1, -1, -2, -1, 0, 0, 1, 2, 1, -1}, new long[] {1, 0, 1, 0, 1, 0, 2, 0, 2, 0, 3});
  }
}

