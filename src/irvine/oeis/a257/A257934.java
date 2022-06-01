package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257934 Expansion of 1/(1-x-x^2-x^3-x^4+x^5+x^6+x^7).
 * @author Sean A. Irvine
 */
public class A257934 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257934() {
    super(new long[] {-1, -1, -1, 1, 1, 1, 1}, new long[] {1, 1, 2, 4, 8, 14, 26});
  }
}
