package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174747 x-values in the solution to x^2-37*y^2=1.
 * @author Sean A. Irvine
 */
public class A174747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174747() {
    super(1, new long[] {-1, 146}, new long[] {1, 73});
  }
}
