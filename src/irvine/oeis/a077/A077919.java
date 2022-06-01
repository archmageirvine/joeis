package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077919 Expansion of (1-x)^(-1)/(1+2*x-2*x^2+2*x^3).
 * @author Sean A. Irvine
 */
public class A077919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077919() {
    super(new long[] {2, -4, 4, -1}, new long[] {1, -1, 5, -13});
  }
}
