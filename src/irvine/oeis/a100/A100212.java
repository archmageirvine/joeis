package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100212 Expansion of <code>(x^5 + 2*x^4)/(1/2*x^2 - 2*x^6 + 2*x^5 - x^4 - 1/2*x + 1/4)</code>.
 * @author Sean A. Irvine
 */
public class A100212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100212() {
    super(new long[] {8, -8, 4, 0, -2, 2}, new long[] {0, 0, 0, 0, 8, 20});
  }
}
