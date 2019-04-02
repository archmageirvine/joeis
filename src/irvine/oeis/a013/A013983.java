package irvine.oeis.a013;

import irvine.oeis.LinearRecurrence;

/**
 * A013983 Expansion of 1/(1-x^2-x^3-x^4-x^5-x^6).
 * @author Sean A. Irvine
 */
public class A013983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A013983() {
    super(new long[] {1, 1, 1, 1, 1, 0}, new long[] {1, 0, 1, 1, 2, 3});
  }
}
