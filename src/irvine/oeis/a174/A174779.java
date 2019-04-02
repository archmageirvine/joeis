package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174779 y-values in the solution to x^2 - 42*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A174779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174779() {
    super(new long[] {-1, 26}, new long[] {0, 2});
  }
}
