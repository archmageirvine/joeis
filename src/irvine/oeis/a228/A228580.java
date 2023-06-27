package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228580 y-values in the solution to the Pell equation x^2 - 106*y^2 = -1.
 * @author Sean A. Irvine
 */
public class A228580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228580() {
    super(1, new long[] {-1, 64160102}, new long[] {389, 24958279289L});
  }
}
