package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175715 Expansion of 1/(1 - x - x^2 - 3*x^4 + 4*x^5 - 2*x^6).
 * @author Sean A. Irvine
 */
public class A175715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175715() {
    super(new long[] {2, -4, 3, 0, 1, 1}, new long[] {1, 1, 2, 3, 8, 10});
  }
}
