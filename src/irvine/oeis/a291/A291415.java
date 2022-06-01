package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291415 p-INVERT of (1,1,0,0,0,0,...), where p(S) = 1 - 3 S + S^2.
 * @author Sean A. Irvine
 */
public class A291415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291415() {
    super(new long[] {-1, -2, 2, 3}, new long[] {3, 11, 37, 126});
  }
}
