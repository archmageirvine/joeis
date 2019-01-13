package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182866.
 * @author Sean A. Irvine
 */
public class A182866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182866() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 56, 810, 4992, 20000, 61560, 158466});
  }
}
