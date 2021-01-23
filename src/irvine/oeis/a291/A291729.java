package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291729 p-INVERT of (1,0,1,0,0,0,0,...), where p(S) = 1 - 2 S - S^2.
 * @author Sean A. Irvine
 */
public class A291729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291729() {
    super(new long[] {1, 0, 2, 2, 1, 2}, new long[] {2, 5, 14, 39, 106, 290});
  }
}
