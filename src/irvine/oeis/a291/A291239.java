package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291239 p-INVERT of <code>(0,1,0,1,0,1,...),</code> where p(S) <code>= (1 -</code> S^2) <code>(1 - 2</code> S).
 * @author Sean A. Irvine
 */
public class A291239 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291239() {
    super(new long[] {1, 2, -4, -6, 4, 2}, new long[] {2, 5, 12, 31, 74, 184});
  }
}
