package irvine.oeis.a015;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A015588 Expansion of x/(1 - 10*x - 3*x^2).
 * @author Sean A. Irvine
 */
public class A015588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015588() {
    super(new long[] {3, 10}, new long[] {0, 1});
  }
}
