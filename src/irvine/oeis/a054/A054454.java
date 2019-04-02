package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054454 Third column of triangle A054453.
 * @author Sean A. Irvine
 */
public class A054454 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054454() {
    super(new long[] {1, 2, -2, -4, 2, 2}, new long[] {1, 2, 6, 12, 26, 50});
  }
}
