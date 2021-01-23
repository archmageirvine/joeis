package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163279 a(n) = (n^6 + 2n^5 + 2n^4 + n^3 + 2n)/2.
 * @author Sean A. Irvine
 */
public class A163279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163279() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {4, 86, 705, 3364, 11630, 32514, 78211});
  }
}
