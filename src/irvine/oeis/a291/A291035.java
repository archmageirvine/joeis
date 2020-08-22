package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291035 p-INVERT of (1,0,0,1,0,0,1,0,0,...), where p(S) = 1 - S - 2 S^2.
 * @author Sean A. Irvine
 */
public class A291035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291035() {
    super(new long[] {-1, 0, -1, 2, 2, 1}, new long[] {1, 3, 5, 12, 27, 58});
  }
}
