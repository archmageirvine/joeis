package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291736 p-INVERT of <code>(1,0,1,0,0,0,0,...),</code> where p(S) <code>= 1 -</code> S^2 - S^3.
 * @author Sean A. Irvine
 */
public class A291736 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291736() {
    super(new long[] {1, 0, 3, 1, 3, 2, 1, 1, 0}, new long[] {0, 1, 1, 3, 5, 7, 16, 22, 47});
  }
}
