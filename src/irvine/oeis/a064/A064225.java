package irvine.oeis.a064;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A064225 (9*n^2+5*n+2)/2.
 * @author Sean A. Irvine
 */
public class A064225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064225() {
    super(new long[] {1, -3, 3}, new long[] {1, 8, 24});
  }
}
