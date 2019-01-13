package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008614.
 * @author Sean A. Irvine
 */
public class A008614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008614() {
    super(new long[] {1, 1, 0, -1, -2, -1, 0, 0, 0, 0, 1, 2, 1, 0, -1},
      new long[] {1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 2, 0, 2});
  }
}

