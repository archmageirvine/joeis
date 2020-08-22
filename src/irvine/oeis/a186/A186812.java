package irvine.oeis.a186;

import irvine.oeis.LinearRecurrence;

/**
 * A186812 Expansion of 1/(1-x^6-3*x^5-4*x^4-3*x^3-2*x^2-x).
 * @author Sean A. Irvine
 */
public class A186812 extends LinearRecurrence {

  /** Construct the sequence. */
  public A186812() {
    super(new long[] {1, 3, 4, 3, 2, 1}, new long[] {1, 1, 3, 8, 21, 53});
  }
}
