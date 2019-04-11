package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015530 Expansion of <code>x/(1 - 4*x - 3*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A015530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015530() {
    super(new long[] {3, 4}, new long[] {0, 1});
  }
}
