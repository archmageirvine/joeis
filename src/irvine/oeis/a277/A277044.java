package irvine.oeis.a277;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A277044 Number of 2 X 2 matrices with entries in {0,1,...,n} and even determinant with no entry repeated.
 * @author Sean A. Irvine
 */
public class A277044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277044() {
    super(new long[] {1, -1, -4, 4, 6, -6, -4, 4, 1}, new long[] {0, 0, 0, 16, 96, 216, 600, 1008, 2064});
  }
}
