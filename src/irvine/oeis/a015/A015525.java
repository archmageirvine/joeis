package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015525 Expansion of x/(1-3*x-8*x^2).
 * @author Sean A. Irvine
 */
public class A015525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015525() {
    super(new long[] {8, 3}, new long[] {0, 1});
  }
}
