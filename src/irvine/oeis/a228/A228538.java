package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228538 y-values in the solution to the Pell equation x^2 - 58*y^2 = -1.
 * @author Sean A. Irvine
 */
public class A228538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228538() {
    super(1, new long[] {-1, 39206}, new long[] {13, 509665});
  }
}
