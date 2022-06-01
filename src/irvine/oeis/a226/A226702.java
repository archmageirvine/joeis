package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226702 Positive solutions y/5 of the Pell equation x^2 - 61*y^2 = -4.
 * @author Sean A. Irvine
 */
public class A226702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226702() {
    super(new long[] {-1, 1523}, new long[] {1, 1522});
  }
}
