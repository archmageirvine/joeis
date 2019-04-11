package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291726 p-INVERT of <code>(1,0,1,0,0,0,0,...),</code> where p(S) <code>= (1 -</code> S)^3.
 * @author Sean A. Irvine
 */
public class A291726 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291726() {
    super(new long[] {1, 0, 3, -3, 3, -6, 4, -3, 3}, new long[] {3, 6, 13, 27, 51, 94, 171, 303, 527});
  }
}
