package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077856 Expansion of (1-x)^(-1)/(1-2*x+x^2+x^3).
 * @author Sean A. Irvine
 */
public class A077856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077856() {
    super(new long[] {1, 0, -3, 3}, new long[] {1, 3, 6, 9});
  }
}
