package irvine.oeis.a111;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A111400 P(P(n)) - P(P(n-1)), where P(n) = (n+1)*(n+2)*(n+3)/6 (see A000292).
 * @author Sean A. Irvine
 */
public class A111400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111400() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 3, 31, 251, 1485, 6665, 24073, 73486, 196626});
  }
}
