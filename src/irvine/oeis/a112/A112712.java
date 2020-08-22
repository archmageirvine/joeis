package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112712 Expansion of x/(1 - x + 2*x^2 - 2*x^3 + 2*x^4 - x^5 + x^6).
 * @author Sean A. Irvine
 */
public class A112712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112712() {
    super(new long[] {-1, 1, -2, 2, -2, 1}, new long[] {0, 1, 1, -1, -1, 1});
  }
}
