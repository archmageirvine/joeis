package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291404 p-INVERT of (1,1,0,0,0,0,...), where p(S) = 1 - S^2 - 2 S^4.
 * @author Sean A. Irvine
 */
public class A291404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291404() {
    super(new long[] {2, 8, 12, 8, 3, 2, 1, 0}, new long[] {0, 1, 2, 4, 12, 23, 42, 89});
  }
}
