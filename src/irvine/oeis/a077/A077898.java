package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077898 Expansion of (1 - x)^(-1)/(1 + x - 2*x^2).
 * @author Sean A. Irvine
 */
public class A077898 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077898() {
    super(new long[] {-2, 3, 0}, new long[] {1, 0, 3});
  }
}
