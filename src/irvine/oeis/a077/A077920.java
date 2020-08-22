package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077920 Expansion of (1-x)^(-1)/(1+2*x-x^2-x^3).
 * @author Sean A. Irvine
 */
public class A077920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077920() {
    super(new long[] {-1, 0, 3, -1}, new long[] {1, -1, 4, -7});
  }
}
