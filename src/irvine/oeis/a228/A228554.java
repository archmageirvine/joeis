package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228554 x-values in the solution to the Pell equation x^2 - 85*y^2 = -1.
 * @author Sean A. Irvine
 */
public class A228554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228554() {
    super(1, new long[] {-1, 571538}, new long[] {378, 216041742});
  }
}
