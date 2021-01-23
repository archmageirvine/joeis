package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291738 p-INVERT of (1,0,1,0,0,0,0,...), where p(S) = 1 - S - S^4.
 * @author Sean A. Irvine
 */
public class A291738 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291738() {
    super(new long[] {1, 0, 4, 0, 6, 0, 4, 0, 1, 1, 0, 1}, new long[] {1, 1, 2, 4, 6, 13, 23, 43, 76, 138, 244, 444});
  }
}
