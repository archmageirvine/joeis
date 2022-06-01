package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077866 Expansion of (1-x)^(-1)/(1 - x - 2*x^2 + 2*x^3).
 * @author Sean A. Irvine
 */
public class A077866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077866() {
    super(new long[] {2, -4, 1, 2}, new long[] {1, 2, 5, 8});
  }
}
