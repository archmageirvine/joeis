package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228209 x-values in the solutions to x^2 - 10y^2 = 9.
 * @author Sean A. Irvine
 */
public class A228209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228209() {
    super(new long[] {-1, 0, 0, 38, 0, 0}, new long[] {3, 7, 13, 57, 253, 487});
  }
}
