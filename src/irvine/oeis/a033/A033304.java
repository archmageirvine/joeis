package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033304 Expansion of (2 + 2*x - 3*x^2) / (1 - 2*x - x^2 + x^3).
 * @author Sean A. Irvine
 */
public class A033304 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033304() {
    super(new long[] {-1, 1, 2}, new long[] {2, 6, 11});
  }
}
