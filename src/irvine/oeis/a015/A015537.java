package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015537 Expansion of x/(1 - 5*x - 4*x^2).
 * @author Sean A. Irvine
 */
public class A015537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015537() {
    super(new long[] {4, 5}, new long[] {0, 1});
  }
}
