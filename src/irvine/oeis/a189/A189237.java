package irvine.oeis.a189;

import irvine.oeis.LinearRecurrence;

/**
 * A189237 Expansion of (5-12*x-9*x^2+8*x^3+x^4)/(1-3*x-3*x^2+4*x^3+x^4-x^5).
 * @author Sean A. Irvine
 */
public class A189237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189237() {
    super(new long[] {1, -1, -4, 3, 3}, new long[] {5, 3, 15, 42, 155});
  }
}
