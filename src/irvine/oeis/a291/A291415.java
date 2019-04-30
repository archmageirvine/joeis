package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291415 p-INVERT of <code>(1,1,0,0,0,0,...)</code>, where p(S) <code>= 1 - 3</code> S + S^2.
 * @author Sean A. Irvine
 */
public class A291415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291415() {
    super(new long[] {-1, -2, 2, 3}, new long[] {3, 11, 37, 126});
  }
}
