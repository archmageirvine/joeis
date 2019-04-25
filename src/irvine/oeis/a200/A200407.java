package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200407 The x-values in the solution to <code>19*x^2 - 18 = y^2</code>.
 * @author Sean A. Irvine
 */
public class A200407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200407() {
    super(new long[] {-1, 0, 0, 340, 0, 0}, new long[] {1, 9, 131, 209, 3051, 44539});
  }
}
