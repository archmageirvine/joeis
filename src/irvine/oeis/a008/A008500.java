package irvine.oeis.a008;

import irvine.oeis.LinearRecurrence;

/**
 * A008500.
 * @author Sean A. Irvine
 */
public class A008500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A008500() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 8, 36, 120, 330, 792, 1716});
  }
}

