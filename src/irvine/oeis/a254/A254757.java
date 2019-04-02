package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254757 Part of the positive proper solutions x of the Pell equation x^2 - 2*y^2 = - 7^2 based on the fundamental solution (x0, y0)= (-1, 5).
 * @author Sean A. Irvine
 */
public class A254757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254757() {
    super(new long[] {-1, 6}, new long[] {17, 103});
  }
}
