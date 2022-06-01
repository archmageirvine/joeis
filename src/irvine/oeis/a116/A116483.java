package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116483 Expansion of (1 + x) / (5*x^2 - 2*x + 1).
 * @author Sean A. Irvine
 */
public class A116483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116483() {
    super(new long[] {-5, 2}, new long[] {1, 3});
  }
}
