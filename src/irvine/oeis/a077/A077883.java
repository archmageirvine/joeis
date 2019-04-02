package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077883 Expansion of (1-x)^(-1)/(1-x^2+x^3).
 * @author Sean A. Irvine
 */
public class A077883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077883() {
    super(new long[] {1, -2, 1, 1}, new long[] {1, 1, 2, 1});
  }
}
