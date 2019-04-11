package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292401 p-INVERT of <code>(1,0,2,0,2,0,2,0,2,0,...),</code> where p(S) <code>= (1 -</code> S)^2.
 * @author Sean A. Irvine
 */
public class A292401 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292401() {
    super(new long[] {-1, -2, -3, 0, 1, 2}, new long[] {2, 3, 8, 17, 34, 71});
  }
}
