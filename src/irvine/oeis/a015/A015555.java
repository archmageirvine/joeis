package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015555 Expansion of x/(1 - 7*x - 2*x^2).
 * @author Sean A. Irvine
 */
public class A015555 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015555() {
    super(new long[] {2, 7}, new long[] {0, 1});
  }
}
