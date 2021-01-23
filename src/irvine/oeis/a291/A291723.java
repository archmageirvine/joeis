package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291723 p-INVERT of (1,0,1,0,0,0,0,...), where p(S) = 1 - S^3.
 * @author Sean A. Irvine
 */
public class A291723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291723() {
    super(new long[] {1, 0, 3, 0, 3, 0, 1, 0, 0}, new long[] {0, 0, 1, 0, 3, 1, 3, 6, 2});
  }
}
