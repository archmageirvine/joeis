package irvine.oeis.a292;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A292321 p-INVERT of (1,0,0,1,0,0,1,0,0,...), where p(S) = 1 - S^2 - S^3.
 * @author Sean A. Irvine
 */
public class A292321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292321() {
    super(new long[] {1, 0, 0, -3, -1, 0, 4, 1, 0}, new long[] {0, 1, 1, 1, 4, 5, 7, 17, 23});
  }
}
