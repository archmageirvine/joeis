package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077965 Expansion of 1/(1+2*x^2-x^3).
 * @author Sean A. Irvine
 */
public class A077965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077965() {
    super(new long[] {1, -2, 0}, new long[] {1, 0, -2});
  }
}
