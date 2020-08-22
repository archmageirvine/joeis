package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015562 Expansion of x/(1 - 7*x - 5*x^2).
 * @author Sean A. Irvine
 */
public class A015562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015562() {
    super(new long[] {5, 7}, new long[] {0, 1});
  }
}
