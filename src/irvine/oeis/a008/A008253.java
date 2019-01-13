package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008253.
 * @author Sean A. Irvine
 */
public class A008253 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008253() {
    super(new long[] {0, 1, -2, 0, 2}, new long[] {1, 4, 12, 24, 42});
  }
}

