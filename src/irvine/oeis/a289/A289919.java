package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289919 p-INVERT of <code>(1,0,0,1,0,0,1,0,0,...),</code> where p(S) <code>= (1 -</code> S)^2.
 * @author Sean A. Irvine
 */
public class A289919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289919() {
    super(new long[] {-1, 0, -2, 2, -1, 2}, new long[] {2, 3, 4, 7, 12, 19});
  }
}
