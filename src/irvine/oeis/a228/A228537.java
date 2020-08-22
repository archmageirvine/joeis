package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228537 x-values in the solution to the Pell equation x^2 - 58*y^2 = -1.
 * @author Sean A. Irvine
 */
public class A228537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228537() {
    super(new long[] {-1, 39206}, new long[] {99, 3881493});
  }
}
