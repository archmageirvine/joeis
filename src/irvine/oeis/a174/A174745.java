package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174745 y-values in the solution to  x^2 - 21*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A174745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174745() {
    super(new long[] {-1, 110}, new long[] {0, 12});
  }
}
