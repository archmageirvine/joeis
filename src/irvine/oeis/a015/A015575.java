package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015575 Expansion of x/(1 - 8*x - 5*x^2).
 * @author Sean A. Irvine
 */
public class A015575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015575() {
    super(new long[] {5, 8}, new long[] {0, 1});
  }
}
