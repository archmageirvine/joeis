package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117910 Expansion of (1 + x + x^2 + x^4)/((1-x^3)*(1-x^6)).
 * @author Sean A. Irvine
 */
public class A117910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117910() {
    super(new long[] {-1, 0, 0, 1, 0, 0, 1, 0, 0}, new long[] {1, 1, 1, 1, 2, 1, 2, 3, 2});
  }
}
