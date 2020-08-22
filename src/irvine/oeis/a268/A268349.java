package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268349 Expansion of (1 + x - x^2 - 6*x^3)/(1 - x - 2*x^2 - 3*x^3 - 4*x^4).
 * @author Sean A. Irvine
 */
public class A268349 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268349() {
    super(new long[] {4, 3, 2, 1}, new long[] {1, 2, 3, 4});
  }
}
