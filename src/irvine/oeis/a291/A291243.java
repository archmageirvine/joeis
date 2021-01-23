package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291243 p-INVERT of (0,1,0,1,0,1,...), where p(S) = 1 - 3 S + S^2.
 * @author Sean A. Irvine
 */
public class A291243 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291243() {
    super(new long[] {-1, -3, 1, 3}, new long[] {3, 8, 24, 71});
  }
}
