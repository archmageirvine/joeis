package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077918 Expansion of (1 - x)^(-1)/(1 + 2*x - 2*x^2 + x^3).
 * @author Sean A. Irvine
 */
public class A077918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077918() {
    super(new long[] {1, -3, 4, -1}, new long[] {1, -1, 5, -12});
  }
}
