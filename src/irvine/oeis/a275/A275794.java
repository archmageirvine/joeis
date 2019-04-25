package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275794 One half of the y members of the positive proper solutions <code>(x = x1(n), y = y1(n))</code> of the first class for the Pell equation <code>x^2 - 2*y^2 = +7^2</code>.
 * @author Sean A. Irvine
 */
public class A275794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275794() {
    super(new long[] {-1, 6}, new long[] {2, 15});
  }
}
