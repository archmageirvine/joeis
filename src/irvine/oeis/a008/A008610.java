package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008610.
 * @author Sean A. Irvine
 */
public class A008610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008610() {
    super(new long[] {-1, 2, 0, -2, 2, -2, 0, 2},
      new long[] {1, 1, 3, 5, 10, 14, 22, 30});
  }
}

