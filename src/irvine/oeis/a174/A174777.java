package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174777 y-values in the solution to <code>x^2 - 38*y^2 = 1</code>.
 * @author Sean A. Irvine
 */
public class A174777 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174777() {
    super(new long[] {-1, 74}, new long[] {0, 6});
  }
}
