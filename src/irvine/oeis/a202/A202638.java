package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202638 y-values in the solution to <code>x^2 - 7*y^2 = -3</code>.
 * @author Sean A. Irvine
 */
public class A202638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202638() {
    super(new long[] {-1, 0, 16, 0}, new long[] {1, 2, 14, 31});
  }
}
