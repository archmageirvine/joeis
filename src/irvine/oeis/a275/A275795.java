package irvine.oeis.a275;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A275795 The x members of the positive proper solutions (x = x2(n), y = y2(n)) of the second class for the Pell equation x^2 - 2*y^2 = +7^2.
 * @author Sean A. Irvine
 */
public class A275795 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275795() {
    super(new long[] {-1, 6}, new long[] {11, 57});
  }
}
