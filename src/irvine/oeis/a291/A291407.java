package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291407 p-INVERT of (1,1,0,0,0,0,...), where p(S) = 1 - S^3 - S^6.
 * @author Sean A. Irvine
 */
public class A291407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291407() {
    super(new long[] {1, 6, 15, 20, 15, 6, 2, 3, 3, 1, 0, 0}, new long[] {0, 0, 1, 3, 3, 3, 12, 30, 43, 57, 120, 259});
  }
}
