package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239305 Expansion of <code>(4*x^4-5*x^3-x^2+3*x-1) / (2*x^5+3*x^4-4*x^3-3*x^2+4*x-1)</code>.
 * @author Sean A. Irvine
 */
public class A239305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239305() {
    super(new long[] {2, 3, -4, -3, 4}, new long[] {1, 1, 2, 6, 13});
  }
}
