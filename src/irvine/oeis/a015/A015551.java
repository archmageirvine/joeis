package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015551 Expansion of x/(1 - 6*x - 5*x^2).
 * @author Sean A. Irvine
 */
public class A015551 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015551() {
    super(new long[] {5, 6}, new long[] {0, 1});
  }
}
