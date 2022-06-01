package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271833 Expansion of (1 + 2*x + 2*x^2 + 2*x^3 - 5*x^4 + 2*x^5 + 2*x^6 + 2*x^7)/((1 - x)^2*(1 + x + x^2 + x^3 + x^4 + x^5 + x^6 + x^7)).
 * @author Sean A. Irvine
 */
public class A271833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271833() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 3, 5, 7, 2, 4, 6, 8, 9});
  }
}
