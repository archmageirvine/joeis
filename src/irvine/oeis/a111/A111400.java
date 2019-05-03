package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111400 <code>P(P(n)) - P(P(n-1))</code>, where <code>P(n) = (n+1)*(n+2)*(n+3)/6</code> (see <code>A000292)</code>.
 * @author Sean A. Irvine
 */
public class A111400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111400() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 3, 31, 251, 1485, 6665, 24073, 73486, 196626});
  }
}
