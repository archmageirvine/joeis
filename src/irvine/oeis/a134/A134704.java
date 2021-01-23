package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134704 "Hidden" person three person game Markov: MA=MB={{0.1},{1,1}}: Fibonacci: game value =1 MC={{-2, -2, 0}, {1, 0, 1}, {0, 1, 1}}: game value=-2 A plays with C; B plays with C; but A has no direct contact with B . A, B are the "observed" games. Characteristic polynomial: 4 + 9 x - 3 x^2 - 12 x^3 + x^4 + 4 x^5 + x^6 - x^7.
 * @author Sean A. Irvine
 */
public class A134704 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134704() {
    super(new long[] {-4, -5, 4, 3, 0}, new long[] {3, 3, 10, 9, 17});
  }
}
