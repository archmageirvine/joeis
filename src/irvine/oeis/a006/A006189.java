package irvine.oeis.a006;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A006189 Number of self-avoiding walks of any length from NW to SW corners of a grid or lattice with n rows and 3 columns.
 * @author Sean A. Irvine
 */
public class A006189 extends LinearRecurrence {

  // Conjectured recurrence

  /** Construct the sequence. */
  public A006189() {
    super(new long[] {1, 2, -3, 4}, new long[] {1, 1, 3, 11});
  }
}

