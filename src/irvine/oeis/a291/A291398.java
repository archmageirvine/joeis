package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291398 p-INVERT of (1,1,0,0,0,0,...), where p(S) = 1 - S^2 - S^3.
 * @author Sean A. Irvine
 */
public class A291398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291398() {
    super(new long[] {1, 3, 4, 3, 1, 0}, new long[] {0, 1, 3, 5, 9, 19});
  }
}
