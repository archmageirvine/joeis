package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291006 p-INVERT of <code>(1,1,1,1,1,...)</code>, where p(S) <code>= 1 -</code> S - S^2 - S^3 - S^4.
 * @author Sean A. Irvine
 */
public class A291006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291006() {
    super(new long[] {-1, 6, -8, 5}, new long[] {1, 3, 9, 27});
  }
}
