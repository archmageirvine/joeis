package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290987 Expansion of (1 - 2*x + x^2 - x^4 + x^3 + x^5)/((1 - x)^2*(1 - 2*x + x^3 - x^4)).
 * @author Sean A. Irvine
 */
public class A290987 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290987() {
    super(new long[] {1, -3, 3, 1, -5, 4}, new long[] {1, 2, 4, 8, 16, 32});
  }
}
