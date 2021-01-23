package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015572 Expansion of x/(1 - 7*x - 12*x^2).
 * @author Sean A. Irvine
 */
public class A015572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015572() {
    super(new long[] {12, 7}, new long[] {0, 1});
  }
}
