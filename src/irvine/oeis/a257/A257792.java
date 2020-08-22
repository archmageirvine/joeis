package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257792 Expansion of 1/(1-x-x^2-x^3-x^5+x^8-x^9).
 * @author Sean A. Irvine
 */
public class A257792 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257792() {
    super(new long[] {1, -1, 0, 0, 1, 0, 1, 1, 1}, new long[] {1, 1, 2, 4, 7, 14, 26, 49, 92});
  }
}
