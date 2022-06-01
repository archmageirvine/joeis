package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020702 Expansion of (1+x^10)/((1-x)*(1-x^2)*(1-x^3)*(1-x^5)).
 * @author Sean A. Irvine
 */
public class A020702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020702() {
    super(new long[] {-1, 1, 1, 0, -1, 0, 0, -1, 0, 1, 1}, new long[] {1, 1, 2, 3, 4, 6, 8, 10, 13, 16, 21});
  }
}
