package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174778 y-values in the solution to <code> x^2 - 41*y^2 = 1</code>.
 * @author Sean A. Irvine
 */
public class A174778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174778() {
    super(new long[] {-1, 4098}, new long[] {0, 320});
  }
}
