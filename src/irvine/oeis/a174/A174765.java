package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174765 y-values in the solution to  x^2 - 19*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A174765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174765() {
    super(new long[] {-1, 340}, new long[] {0, 39});
  }
}
