package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100212 Expansion of 4*x^4*(2 + x)/(1 - 2*x + 2*x^2 - 4*x^4 + 8*x^5 - 8*x^6).
 * @author Sean A. Irvine
 */
public class A100212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100212() {
    super(new long[] {8, -8, 4, 0, -2, 2}, new long[] {0, 0, 0, 0, 8, 20});
  }
}
