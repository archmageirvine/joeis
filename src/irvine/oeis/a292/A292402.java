package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292402 p-INVERT of (1,0,0,1,0,0,0,0,0,0,...), where p(S) = 1 - S^2.
 * @author Sean A. Irvine
 */
public class A292402 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292402() {
    super(new long[] {1, 0, 0, 2, 0, 0, 1, 0}, new long[] {0, 1, 0, 1, 2, 1, 4, 2});
  }
}
