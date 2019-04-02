package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275793 The x members of the positive proper solutions (x = x1(n), y = y1(n)) of the first class for the Pell equation x^2 - 2*y^2 = +7^2.
 * @author Sean A. Irvine
 */
public class A275793 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275793() {
    super(new long[] {-1, 6}, new long[] {9, 43});
  }
}
