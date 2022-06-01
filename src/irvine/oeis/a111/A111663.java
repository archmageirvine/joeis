package irvine.oeis.a111;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A111663 Expansion of (-1+x^3+x^6+x^9)/((1-x)*(2*x-1)*(x^2+1)*(x^2+x+1)*(x^4-x^2+1)).
 * @author Sean A. Irvine
 */
public class A111663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111663() {
    super(new long[] {-2, 1, 0, 2, -1, 0, -2, 1, 0, 2}, new long[] {1, 2, 4, 8, 16, 32, 62, 124, 248, 494});
  }
}
