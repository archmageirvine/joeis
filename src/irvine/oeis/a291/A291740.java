package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291740 p-INVERT of <code>(1,0,1,0,0,0,0,...),</code> where p(S) <code>= (1 -</code> S)(1 - S^2).
 * @author Sean A. Irvine
 */
public class A291740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291740() {
    super(new long[] {-1, 0, -3, 1, -3, 2, 0, 1, 1}, new long[] {1, 2, 3, 7, 9, 18, 25, 47, 65});
  }
}
