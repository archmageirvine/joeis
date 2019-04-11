package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292323 p-INVERT of <code>(1,0,0,1,0,0,1,0,0,...),</code> where p(S) <code>= (1 -</code> S)(1 + S^2).
 * @author Sean A. Irvine
 */
public class A292323 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292323() {
    super(new long[] {1, 0, 1, -3, 1, -2, 4, -1, 1}, new long[] {1, 0, 0, 2, 1, 0, 5, 6, 1});
  }
}
