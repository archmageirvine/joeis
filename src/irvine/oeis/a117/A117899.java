package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117899 Expansion of (1 + 2*x + 5*x^2 + 3*x^3 + 2*x^4)/(1-x^3)^2.
 * @author Sean A. Irvine
 */
public class A117899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117899() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {1, 2, 5, 5, 6, 10});
  }
}
