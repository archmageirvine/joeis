package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015530 Expansion of x/(1 - 4*x - 3*x^2).
 * @author Sean A. Irvine
 */
public class A015530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015530() {
    super(new long[] {3, 4}, new long[] {0, 1});
  }
}
