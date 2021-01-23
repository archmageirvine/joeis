package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179339 Positive integers of the form (30*m^2+1)/11.
 * @author Sean A. Irvine
 */
public class A179339 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179339() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {11, 221, 461, 1091, 1571});
  }
}
