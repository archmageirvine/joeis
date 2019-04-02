package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077992 Expansion of 1/(1+2*x+2*x^2-x^3).
 * @author Sean A. Irvine
 */
public class A077992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077992() {
    super(new long[] {1, -2, -2}, new long[] {1, -2, 2});
  }
}
