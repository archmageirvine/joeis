package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288165 Expansion of x^4/((1-x^4)*(1-x^3)*(1-x^6)*(1-x^9)).
 * @author Sean A. Irvine
 */
public class A288165 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288165() {
    super(new long[] {-1, 0, 0, 1, 1, 0, 1, -1, 0, 0, -1, 0, -1, 0, 0, -1, 1, 0, 1, 1, 0, 0}, new long[] {0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 2, 1, 1, 3, 2, 1, 5, 3, 2, 6, 5, 3});
  }
}
