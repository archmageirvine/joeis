package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228580 y-values in the solution to the Pell equation <code>x^2 - 106*y^2 = -1</code>.
 * @author Sean A. Irvine
 */
public class A228580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228580() {
    super(new long[] {-1, 64160102}, new long[] {389, 24958279289L});
  }
}
